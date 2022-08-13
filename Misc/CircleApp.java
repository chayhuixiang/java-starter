package Misc;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        String menu = """
                        ==== Circle Computation =====
                        |1. Create a new circle |
                        |2. Print Area |
                        |3. Print circumference |
                        |4. Quit |
                        =============================
                        """;
        Scanner userInput = new Scanner(System.in);
        int userChoice;
        System.out.println(menu);
        Circle circle1 = new Circle(0);

        do {
            System.out.println("Choose option (1-3):");
            userChoice = userInput.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Enter the radius to compute the area and circumference");
                    double rad = userInput.nextDouble();
                    circle1 = new Circle(rad);
                    System.out.println("A new circle is created");
                    break;

                case 2:
                    try {
                        circle1.printArea();
                    } catch (Exception e) {
                        System.out.println("Create a circle first!");
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + userChoice);
            }
        } while (userChoice != 4);
        userInput.close();
    }
}
