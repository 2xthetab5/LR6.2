import java.util.Scanner;

public class melee {
    String type_of_melee;
    int durability_of_melee;
    String color_of_melee;

    public melee(String type_of_melee, int durability_of_melee, String color_of_melee) {
        this.type_of_melee = type_of_melee;
        this.durability_of_melee = durability_of_melee;
        this.color_of_melee = color_of_melee;
    }

    public melee() {
        this.type_of_melee = "type_of_melee";
        this.durability_of_melee = 0;
        this.color_of_melee = "color_of_melee";
    }

    public void input() {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите каким оружием ближнего боя владеет ваш трансформер(saw, sword, axe, spear, mace): ");
        type_of_melee = vvod.nextLine();
        System.out.println("Введите цвет оружия ближнего боя(eng): ");
        color_of_melee = vvod.nextLine();
        System.out.println("Введите прочность оружия ближнего боя(от 1 до 100): ");
        durability_of_melee = vvod.nextInt();
    }

    public void output() {
        System.out.println("Оружие ближнего боя вашего трансформера: " + type_of_melee);
        System.out.println("Прочность оружия ближнего боя: " + durability_of_melee);
        System.out.println("Цвет оружия ближнего боя: " + color_of_melee);
    }
}