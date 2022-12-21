import java.util.Scanner;

abstract public class person {
    public String getName(){
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите имя вашего трансформера: ");
        String name = vvod.nextLine();
        return name;
    }
    public abstract void display();
}
