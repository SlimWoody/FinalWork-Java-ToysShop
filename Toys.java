/** 
 * Класс Игрушки со свойствами <b>id</b>, <b>name</b>, <b>quantity</b>, <b>weight</b>.
 * @autor Лузин Павел
*/
public class Toys {
    private int id;
    private String name;
    private int quantity;
    private double weight;

/** 
* Конструктор - создание нового объекта с определенными значениями
* @param id - номер
* @param name - имя
* @param quantity - количество
* @param weight - масса
* @see Toys#Toys()
*/
    public Toys(int id, String name, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}