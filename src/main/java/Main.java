import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input = "";

        try (Scanner scanner = new Scanner(System.in)) {
            while (!input.equals("stop")) {
                System.out.println("\nInput S for square, C for circle, \"stop\" for exit");
                input = scanner.nextLine();
                if (!input.matches("[CS]")) {
                    System.out.println("Input does not match pattern");
                    continue;
                }

                System.out.println( input.equals("C") ? "Input radius:" : "Input square side length:");
                double value = 0;
                try {
                    value = scanner.nextDouble();
                    if (value < 0) throw new InputMismatchException();
                } catch (InputMismatchException mme) {
                    System.out.println("Input must be a non-negative numeric value");
                    continue;
                }

                Shape shape = ShapeFactory.getInstance(input, value);
                System.out.println("Square: " + shape.getArea());
                input = scanner.nextLine();
            }
        }
    }
}
