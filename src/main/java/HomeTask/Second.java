package HomeTask;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("Please enter three numbers :");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double summ = a + b + c;
        double multip = a * b * c;
        System.out.println("Summary three numbers " + summ + ". Multiplication three numbers " + multip);

    }
}
