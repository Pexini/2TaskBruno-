package HomeTask;

import java.util.Scanner;

public class LengthLane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your sentence, i help  calculate length it");
        String userSent = scanner.nextLine();


        System.out.println("Length your sentence is : " + userSent.length());
    }
}
