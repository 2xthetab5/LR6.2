import java.util.Scanner;

public class general_transformer extends transformer implements Cloneable {
    int subTransformers;
    //вызов конструктора базового класса в конструкторе производного класса с параметрами
    public general_transformer(melee your_melee, weapon your_weapon, kind your_kind, form your_form, int subTransformers){
        super(your_melee, your_weapon, your_kind, your_form);
        this.subTransformers = subTransformers;
    }
    public int getSubTransformers(){
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите сколько подчиненных будет у вашего Главного трансформера: ");
        subTransformers = vvod.nextInt();
        return subTransformers;
    }
    @Override
    public void display(){
        System.out.printf("У %s %d подчиненных \n", super.getName(), getSubTransformers());
    }
    public String toString(){
        return "У %s %d подчиненных \n"+ super.getName() + getSubTransformers();
    }
    public void color(){
        System.out.println("-----Перегрузка метода базового класса без вызова базового класса-----");
        if ((your_melee.color_of_melee.equals(your_weapon.color_of_weapon)) && (your_melee.color_of_melee.equals(your_kind.color_of_transformer)))
            System.out.println("Ваш Главный трансформер одноцветный");
        else
            System.out.println("Ваш Главный трансформер разноцветный");
    }
    /*public void color(){
        System.out.println("-----Перегрузка метода базового класса с вызовом метода базового класса-----");
        super.color();
    }*/
    //мелкое клонирование
    public Object clone()  // перегрузка метода интерфейса Cloneable из суперкласса
    {
        return(general_transformer)super.clone();
    }

}
