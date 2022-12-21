import java.util.Scanner;

public class kind {
    String color_of_transformer;
    String genus;
    int age_of_transformer;

    public kind(String color_of_transformer, String genus, int age_of_transformer) {
        this.color_of_transformer = color_of_transformer;
        this.genus = genus;
        this.age_of_transformer = age_of_transformer;
    }

    public kind() {
        this.color_of_transformer = "color_of_transformer";
        this.genus = "genus";
        this.age_of_transformer = 0;
    }

    public void input() {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите род вашего трансформера(autobot или deseptikon): ");
        genus = vvod.nextLine();
        System.out.println("Введите общий цвет вашего трансформера(eng): ");
        color_of_transformer = vvod.nextLine();
        System.out.println("Введите возраст вашего трансформера: ");
        age_of_transformer = vvod.nextInt();
    }

    public void output() {
        System.out.println("Род: " + genus);
        System.out.println("Возраст: " + age_of_transformer);
        System.out.println("Цвет: " + color_of_transformer);
    }
}