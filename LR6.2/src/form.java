//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class form {
    String model_of_car;
    int speed;
    int horsepower;

    public form(String model_of_car, int speed, int horsepower) {
        this.model_of_car = model_of_car;
        this.speed = speed;
        this.horsepower = horsepower;
    }

    public form() {
        this.model_of_car = "model_of_car";
        this.speed = 0;
        this.horsepower = 0;
    }

    public void input() {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Введите в какой транспорт превращается ваш трансформер(sportcar, truck, tank, jeep): ");
        this.model_of_car = var1.nextLine();
        System.out.println("Введите количество лошадиных сил у транспорта, в который превращается ваш трансформер(от 100 до 1000): ");
        this.horsepower = var1.nextInt();
        System.out.println("Введите максимальную скорость транспорта(в км/ч), в который превращается ваш трансформер(от 120 до 400): ");
        this.speed = var1.nextInt();
    }

    public void output() {
        System.out.println("Транспорт, в который превращается ваш трансформер: " + this.model_of_car);
        System.out.println("Количество лошадиных сил транспорта, в который превращается ваш трансформер: " + this.horsepower);
        System.out.println("Максимальная скорость транспорта, в который превращается ваш трансформер: " + this.speed);
    }
}
