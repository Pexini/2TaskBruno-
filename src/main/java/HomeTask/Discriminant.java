package HomeTask;

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers, i can calculate the discriminant");
        System.out.println("Enter - a");
        double a = scanner.nextDouble();

        System.out.println("Enter  - b");
        double b = scanner.nextDouble();

        System.out.println("Enter  - c");
        double c = scanner.nextDouble();
        // Дискриминант считается по формуле D=b^2-4ac.

        double discriminant = b * b - 4 * a * c;
        System.out.println("Discriminant = " + discriminant);
    }
}
