import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double input;

        System.out.printf("Enter your GPA: ");
        input = keyboard.nextDouble();

        System.out.println(GPA.checkStanding(input));
    }


}