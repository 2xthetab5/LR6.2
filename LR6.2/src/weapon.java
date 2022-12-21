import java.util.Scanner;

public class weapon {
    String type_of_weapon;
    int durability_of_weapon;
    String color_of_weapon;
    int ammo_of_weapon;

    public weapon(String type_of_weapon, String color_of_weapon, int durability_of_weapon, int ammo_of_weapon) {
        this.type_of_weapon = type_of_weapon;
        this.durability_of_weapon = durability_of_weapon;
        this.color_of_weapon = color_of_weapon;
        this.ammo_of_weapon = ammo_of_weapon;
    }

    public weapon() {
        this.type_of_weapon = "type_of_weapon";
        this.durability_of_weapon = 0;
        this.color_of_weapon = "color_of_weapon";
        this.ammo_of_weapon = 0;
    }

    public void input() {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Введите каким оружием дальнего боя владеет ваш трансформер(machinegun, rocketlauncher, laser): ");
        this.type_of_weapon = var1.nextLine();
        System.out.println("Введите цвет оружия дальнего боя(eng): ");
        this.color_of_weapon = var1.nextLine();
        System.out.println("Введите прочность оружия дальнего боя(от 1 до 100): ");
        this.durability_of_weapon = var1.nextInt();
        System.out.println("Введите количество патронов в оружии дальнего боя(от 0 до 200): ");
        this.ammo_of_weapon = var1.nextInt();
    }

    public void output() {
        System.out.println("Оружие дальнего боя вашего трансформера: " + this.type_of_weapon);
        System.out.println("Прочность оружия дальнего боя: " + this.durability_of_weapon);
        System.out.println("Цвет оружия дальнего боя: " + this.color_of_weapon);
        System.out.println("Количество патронов в оружии дальнего боя: " + this.ammo_of_weapon);
    }
}
