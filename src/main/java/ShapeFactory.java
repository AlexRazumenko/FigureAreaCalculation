import java.util.function.DoubleUnaryOperator;

public class ShapeFactory {

//    public static String input;

    public static Shape getInstance (String input, double value) {

        switch (input) {
            case"C":
            case"c":
                return new Circle(value,
                        Calculator.calculateArea(radius -> Math.PI * radius * radius, value));
            case"S":
            case"s":
                return new Square(value,
                        Calculator.calculateArea(side -> side * side, value));
            default:
                throw new IllegalArgumentException("Input doesn't match pattern");
        }
    }

    static class Calculator {

        static double calculateArea (DoubleUnaryOperator formula, double value) {
            return formula.applyAsDouble(value);
        }


    }



}
