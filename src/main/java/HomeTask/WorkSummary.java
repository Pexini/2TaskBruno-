package HomeTask;

import java.util.Scanner;

public class WorkSummary {
    public static void main(String[] args) {
        System.out.println("I can help you calculate your salary. Please enter your working days :" );
        Scanner scanner = new Scanner(System.in);
        int dayWork = scanner.nextInt();
        double daySalary = 5500.25;
        double sallaryMounth = dayWork*daySalary;
        System.out.println("Yout mounth sallary : " + sallaryMounth);
    }
}
