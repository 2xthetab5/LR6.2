import java.util.Scanner;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        int x = 0;
        int i = 0;
        int min, max;
        transformer[] your_transformer = new transformer[10];
        transformer[][] your_transformer_2 = new transformer[10][10];
        while (x != 8) {
            System.out.println("Введите:");
            System.out.println("1 - для создания вашего трансформера");
            System.out.println("2 - для вывода всех трансформеров");
            System.out.println("3 - для вывода случайного числа через вспомогательный класс");
            System.out.println("4 - для создания трансформера в двумерном массиве");
            System.out.println("5 - для вывода трансформера в двумерном массиве");
            System.out.println("6 - для ввода-вывода информации о главном трансформере");
            System.out.println("7 - для реализации шаблона класса Account");
            System.out.println("8 - выхода");
            Scanner vvod = new Scanner(System.in);
            /////TRY БЛОК/////
            try {
                x = vvod.nextInt();
                if (x > 7 || x < 1)
                    throw new OptionException("invalid range");
            } catch (InputMismatchException e) {
                System.err.println("Нужно вводить цифру");
            } catch (OptionException e) {
                System.err.println("Диапазон 1-7");
            }
            switch (x) {
                case 1:
                    melee your_melee = new melee();
                    weapon your_weapon = new weapon();
                    kind your_kind = new kind();
                    form your_form = new form();

                    your_transformer[i] = new transformer(your_melee, your_weapon, your_kind, your_form);
                    your_transformer[i].input();
                    your_transformer[i].output();
                    your_transformer[i].color();
                    your_transformer[i].speed_type();
                    i++;
                    transformer.counter_1++;
                    break;
                case 2:
                    for (int j = 0; j < transformer.counter_1; j++) {
                        your_transformer[j].output();
                        your_transformer[j].color();
                        your_transformer[j].speed_type();
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    System.out.println("Введите нижнюю границу:");
                    min = vvod.nextInt();
                    System.out.println("Введите верхнюю границу:");
                    max = vvod.nextInt();
                    System.out.println("Случайное число: "+ generateRandomInt.generateRandomIntRange(min, max));
                    break;
                case 4:
                    //ДВУМЕРНЫЙ МАССИВ ОБЪЕКТОВ//
                    for (int k = 0; k < 1; k++){
                        for (int j = 0; j < 1; j++){
                            your_melee = new melee();
                            your_weapon = new weapon();
                            your_kind = new kind();
                            your_form = new form();

                            your_transformer_2[i][j] = new transformer(your_melee, your_weapon, your_kind, your_form);
                            your_transformer_2[i][j].input();
                            your_transformer_2[i][j].output();
                            your_transformer_2[i][j].color();
                            your_transformer_2[i][j].speed_type();
                            transformer.counter_2++;
                        }
                    }
                    break;
                case 5:
                    //ДВУМЕРНЫЙ МАССИВ ОБЪЕКТОВ - ВЫВОД//
                    for (int k = 0; k < transformer.counter_2; k++)
                        for (int j = 0; j < transformer.counter_2; j++) {
                            your_transformer_2[i][j].output();
                            your_transformer_2[i][j].color();
                            your_transformer_2[i][j].speed_type();
                            System.out.println("\n");
                        }
                    break;
                case 6:
                    //работа с производным классом в main
                    your_melee = new melee();
                    your_weapon = new weapon();
                    your_kind = new kind();
                    your_form = new form();
                    int subTransformers = 0;
                    general_transformer Optimus = new general_transformer(your_melee, your_weapon, your_kind, your_form, subTransformers);
                    //мелкое клонирование
                    general_transformer Megatron = new general_transformer(your_melee, your_weapon, your_kind, your_form, subTransformers);
                    Megatron=(general_transformer)Optimus.clone();
                    //глубокое клонирование
                    transformer Petya = new transformer(your_melee, your_weapon, your_kind, your_form);
                    transformer Vasya = new transformer(your_melee, your_weapon, your_kind, your_form);
                    Petya = (transformer)Vasya.clone();
                    //демонстрация использования метода из абстрактного класса
                    Optimus.input();
                    Optimus.output();
                    //перегрузка метода базового класса без вызова базового класса и с таким вызовом
                    Optimus.color();
                    Optimus.speed_type();
                    //демонстрация использования метода из абстрактного класса
                    Optimus.display();
                    //вывод с заменой метода display на метод toString
                    Optimus.toString();
                    break;
                case 7:
                    //вариант Account, где id - набор символов, включающий цифры и буквы
                    Account<String> acc1 = new Account<String>("2345abc");
                    String acc1Id = acc1.getId();
                    System.out.println(acc1Id);
                    //вариант Account, где id - набор цифр
                    Account<Integer> acc2 = new Account<Integer>(2345);
                    Integer acc2Id = acc2.getId();
                    System.out.println(acc2Id);
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}