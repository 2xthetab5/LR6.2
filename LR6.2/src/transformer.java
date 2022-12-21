import java.util.Scanner;

interface test_1{
    void input();
}
interface test_2{
    void output();
}

public class transformer extends person implements test_1, test_2, Cloneable {
    protected melee your_melee;
    protected weapon your_weapon;
    protected kind your_kind;
    protected form your_form;
    public static int counter_1 = 0; //одномерный массив
    public static int counter_2 = 0; //двумерный массив
    public general_transformer clon;
    protected transformer(melee your_melee, weapon your_weapon, kind your_kind, form your_form) {
        this.your_melee = your_melee;
        this.your_weapon = your_weapon;
        this.your_kind = your_kind;
        this.your_form = your_form;
        int subTransformers = 0;
        clon = new general_transformer(your_melee, your_weapon, your_kind, your_form, subTransformers);
    }
    public Object clone() // перегрузка клонирования
    {
        try
        {
            transformer clone=(transformer)super.clone();
            clone.clon= (general_transformer) clon.clone();  // клонирование поля clon (general_transformer) !
            return clone;
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("CloneNotSupportedException");
        }
        return this;
    }

    public void input() {
        your_kind.input();
        your_melee.input();
        your_weapon.input();
        your_form.input();
    }

    public void output() {
        your_kind.output();
        your_melee.output();
        your_weapon.output();
        your_form.output();
    }

    protected void color() {
        if ((your_melee.color_of_melee.equals(your_weapon.color_of_weapon)) && (your_melee.color_of_melee.equals(your_kind.color_of_transformer)))
            System.out.println("Ваш трансформер одноцветный");
        else
            System.out.println("Ваш трансформер разноцветный");
    }

    protected void speed_type() {
        if ((your_form.speed >= 120) && (your_form.speed < 200))
            System.out.println("У вашего трансформера маленькая скорость");
        if ((your_form.speed >= 200) && (your_form.speed < 300))
            System.out.println("У вашего трансформера средняя скорость");
        if ((your_form.speed >= 300) && (your_form.speed <= 400))
            System.out.println("У вашего трансформера большая скорость");
    }

    @Override
    public void display() {
        System.out.printf("Имя трансформера: %s \n", super.getName());
    }
}
