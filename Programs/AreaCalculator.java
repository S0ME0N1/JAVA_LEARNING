import java.util.Scanner;

public class AreaCalculator {

    private static final float PI = 3.142f;

    private static float circle(float radius) {
        return PI * radius * radius;
    }

    private static float square(float length) {
        return length * length;
    }

    private static float rectangle(float length, float breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Area Calculator!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter 1 for Circle");
            System.out.println("Enter 2 for Square");
            System.out.println("Enter 3 for Rectangle");
            System.out.println("Enter 0 to Exit");

            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the radius of the circle: ");
                float radius = scanner.nextFloat();
                System.out.println("Area of Circle = " + circle(radius));

            } else if (choice == 2) {
                System.out.print("Enter the length of the square: ");
                float length = scanner.nextFloat();
                System.out.println("Area of Square = " + square(length));

            } else if (choice == 3) {
                System.out.print("Enter the length of the rectangle: ");
                float length = scanner.nextFloat();
                System.out.print("Enter the breadth of the rectangle: ");
                float breadth = scanner.nextFloat();
                System.out.println("Area of Rectangle = " + rectangle(length, breadth));

            } else if (choice == 0) {
                System.out.println("Exiting Area Calculator. Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        scanner.close();
    }
}
