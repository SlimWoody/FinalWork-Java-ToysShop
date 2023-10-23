import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ToysStore store = new ToysStore();

        // добаляем игрушки 
        store.addToy(1, "Lego", 10, 0.5);
        store.addToy(2, "Soft toy", 10, 1);
        store.addToy(3, "Creative set", 10, 1.2);

        // установим вес мягких игрушек
        store.setToyWeight(2, 0.9);

        // запуск розыгрыша 
        store.play();

        // получаем призовую игрушку
        try {
            store.getPrizeToy();
        }catch (IOException e) {
        System.out.println(e.getMessage());
    } finally {
        }
        
    }
}