import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean runProgram = true;
        GPA gpaCalculator = new GPA();

        while (runProgram) {
            Scanner keyboard = new Scanner(System.in);
            int input;

            System.out.println("GPA Calculator");
            System.out.println("--------------");
            System.out.println("1) Add grade");
            System.out.println("2) Calculate GPA");
            System.out.println("3) Check GPA Standing");
            System.out.println("4) Exit\n");

            System.out.print("Enter an option (1-4): ");
            input = keyboard.nextInt();

            if (input == 1)
                addGrade(gpaCalculator);
            else if (input == 2)
                calculateGPA(gpaCalculator);
            else if (input == 3)
                checkStanding(gpaCalculator);
            else if (input == 4)
                runProgram = false;
            else
                System.out.println("* Invalid input\n");
        }


    }

    public static void addGrade(GPA calc) {
        Scanner keyboard = new Scanner(System.in);
        String input;

        System.out.println("GPA Calculator");
        System.out.println("--------------");
        System.out.println("Current grades: " + calc.printGradesList());
        System.out.print("Enter a grade: ");
        input = keyboard.nextLine();

        try {
            calc.addGrade(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
    }

    public static void calculateGPA(GPA calc) {
        System.out.println("GPA Calculator");
        System.out.println("--------------");
        System.out.println("Current grades: " + calc.printGradesList());
        System.out.println("GPA: " + calc.calculateGPA());
        System.out.println();
    }

    public static void checkStanding(GPA calc) {
        Scanner keyboard = new Scanner(System.in);
        double input;

        System.out.println("GPA Calculator");
        System.out.println("--------------");
        System.out.print("Enter your GPA: ");
        input = keyboard.nextDouble();

        if (GPA.verifyGPA(input))
            System.out.println(GPA.checkStanding(input));
        else
            System.out.println("Invalid input");

        System.out.println();
    }
}