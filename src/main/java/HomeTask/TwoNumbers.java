package HomeTask;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        System.out.println("Введите значения двух переменных: ");
        System.out.println("Введите значения переменной a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите значения переменной b: ");
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
//дописать недостающий код
        System.out.println("Теперь переменная а " + a + ", переменная b " + b);
    }
}

