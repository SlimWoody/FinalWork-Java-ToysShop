import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToysStore {
    private List<Toys> toys;
    private List<Toys> prizeToys;

    public ToysStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addToy(int id, String name, int quantity, double weight) {
        Toys toy = new Toys(id, name, quantity, weight);
        toys.add(toy);
    }

    public void setToyWeight(int id, double weight) {
        for (Toys toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public void play() {
        // вычисляем общий вес
        double totalWeight = 0;
        for (Toys toy : toys) {
            totalWeight += toy.getWeight();
        }

        // генерируем случайное число
        Random rand = new Random();
        double randomNumber = rand.nextDouble() * totalWeight;

        // находим игрушку-приз
        Toys prizeToy = null;
        for (Toys toy : toys) {
            if (randomNumber < toy.getWeight()) {
                prizeToy = toy;
                break;
            }
            randomNumber -= toy.getWeight();
        }

        // добавляем призовую игрушку в список призовых игрушек
        if (prizeToy != null && prizeToy.getQuantity() > 0) {
            prizeToys.add(prizeToy);

        // уменьшаем количество призовых игрушек
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);
        }
    }

    public void getPrizeToy() throws IOException {
        if (prizeToys.size() > 0) {
            // удаляем первую призовую игрушку из списка
            Toys prizeToy = prizeToys.remove(0);

            // записываем призовую игрушку в файл
            FileWriter writer = new FileWriter("prize_toys.txt", true);
            writer.write(prizeToy.getId() + ", " + prizeToy.getName() + "\n");
            writer.close();
        }
    }
}