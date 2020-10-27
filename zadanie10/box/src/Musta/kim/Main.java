package Musta.kim;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 40;
        box1.length = 60;
        box1.weight = 100;
        box1.color = "Синий";
        box1.material  = "Пластик";
        System.out.println();
        System.out.println();

        Box box2 = new Box();
        box2.height = 20;
        box2.length = 20;
        box2.weight = 30;
        box2.color = "Жёлтый";
        box2.material = "Деревянный";
        System.out.println("Цвет:" + box2.color);
        System.out.println("Размеры:" + box2.weight + "см x " + box2.length + "см");
        System.out.println("Материал:" + box2.material);
        System.out.println("Вес:" + box2.weight + "кг");
        
    }
}
class Box {
    double height;
    double length;
    double weight;
    String color;
    String material;

}
