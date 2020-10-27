package Musta.kim;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.madel = "Опел";
        car1.color = "Синий";
        car1.type = "Механик";
        car1.producetime = 1998;

        Car car2 = new Car();
        car2.madel = "BMW";
        car2.color = "черный";
        car2.type = "Автомат";
        car2.producetime = 2000;

        Car car3 = new Car();
        car3.madel = "Rang Rover";
        car3.color = "Металик";
        car3.type = "Автомат";
        car3.producetime = 2008;

        Car car4 = new Car();
        car4.madel = "Лада";
        car4.color = "Белый";
        car4.type = "Механик";
        car4.producetime = 2007;

        System.out.println("Модел:" + car4.madel);
        System.out.println("Цвет:" + car4.color);
        System.out.println("Тип:" + car4.type);
        System.out.println("Год:" + car4.producetime);

    }
}
class Car{
    String madel;
    String color;
    String type;
    int producetime;
}
