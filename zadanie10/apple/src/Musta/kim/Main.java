package Musta.kim;

public class Main {

    public static void main(String[] args) {
        Apple apple1 = new Apple();
        apple1.kind = "Файзободи";
        apple1.color = "Желтое";
        apple1.sour = "Да";
        apple1.region = "Хатлон ";

        Apple apple2 = new Apple();
        apple2.kind = "Худжанди";
        apple2.color  = "Зеленное";
        apple2.sour = "Да";
        apple2.region = "Сугд";

        Apple apple3 = new Apple();
        apple3.kind = "Гарми";
        apple3.color = "Красное";
        apple3.sour = "Нет";
        apple3.region = "ВМКБ";

        System.out.println("Сорт:" + apple3.kind);
        System.out.println("Цвет:" + apple3.color);
        System.out.println("Кислое:" + apple3.sour);
        System.out.println("Регион:" + apple3.region);

    }
}
class Apple {

    String  kind;
    String color;
    String sour;
    String region;

}
