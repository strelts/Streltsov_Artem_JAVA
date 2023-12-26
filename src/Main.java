import java.util.Scanner;

public class Main {
    public static void N1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        if (number > 7)
        {
            System.out.println("Привет");
        }
    }
    public static void N2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        if (name.equals("Вячеслав"))
        {
            System.out.println("Привет , "+name);
        }
        else {
            System.out.println("Нет такого имени");
        }
    }
    public static void N3()
    {
        int nubmers[] = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println("Элементы кратные 3: ");
        for (int i = 0; i < nubmers.length; i++) {
            if (nubmers[i] % 3 == 0) {
                System.out.println(nubmers[i]);
            }
        }
    }
    public static void main(String[] args) {
        N1(); //Запуск первого задания.
        N2();//Запуск второго задания.
        N3();//Запуск третьего задания.
    }
}