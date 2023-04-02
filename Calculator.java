import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Factorial");
            System.out.println("7. Square");
            System.out.println("8. Cube");
            System.out.println("9. Square Root");
            System.out.println("10. a Power b");
            System.out.println("11. a Root b");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the first number:");
                    num1 = sc.nextDouble();
                    System.out.println("Enter the second number:");
                    num2 = sc.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    System.out.println("Enter the first number:");
                    num1 = sc.nextDouble();
                    System.out.println("Enter the second number:");
                    num2 = sc.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    System.out.println("Enter the first number:");
                    num1 = sc.nextDouble();
                    System.out.println("Enter the second number:");
                    num2 = sc.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    System.out.println("Enter the first number:");
                    num1 = sc.nextDouble();
                    System.out.println("Enter the second number:");
                    num2 = sc.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                        break;
                    }
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;

                case 5:
                    System.out.println("Enter the number:");
                    num1 = sc.nextDouble();
                    System.out.println("Enter the percentage:");
                    num2 = sc.nextDouble();
                    result = (num1 * num2) / 100;
                    System.out.println("Result: " + result);
                    break;

                case 6:
                    System.out.println("Enter the number:");
                    num1 = sc.nextDouble();
                    result = factorial(num1);
                    System.out.println("Result: " + result);
                    break;

                case 7:
                    System.out.println("Enter the number:");
                    num1 = sc.nextDouble();
                    result = num1 * num1;
                    System.out.println("Result: " + result);
                    break;

                case 8:
                    System.out.println("Enter the number:");
                    num1 = sc.nextDouble();
                    result = num1 * num1 * num1;
                    System.out.println("Result: " + result);
                    break;

                case 9:
                    System.out.println("Enter the number:");
                    num1 = sc.nextDouble();
                    result = Math.sqrt(num1);
                    System.out.println("Result: " + result);
                    break;
                case 10:
                    System.out.println("Enter the base number:");
                    num1 = sc.nextDouble();
                    System.out.println("Enter the exponent number:");
                    num2 = sc.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 11:
                    System.out.println("Enter the base number:");
                    num1 = sc.nextDouble();
                    System.out.println("Enter the root number:");
                    num2 = sc.nextDouble();
                    result = Math.pow(num1, 1 / num2);
                    System.out.println("Result: " + result);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 0);

        sc.close();

    }

    // factorial function
    public static double factorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}