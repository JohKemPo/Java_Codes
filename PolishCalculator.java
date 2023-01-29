import java.util.Stack;

class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(realPart + other.realPart,
                                 imaginaryPart + other.imaginaryPart);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(realPart - other.realPart,
                                 imaginaryPart - other.imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(realPart * other.realPart - imaginaryPart * other.imaginaryPart,
                                 realPart * other.imaginaryPart + imaginaryPart * other.realPart);
    }

    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}

public class PolishCalculator {
    private Stack<ComplexNumber> stack;

    public PolishCalculator() {
        stack = new Stack<ComplexNumber>();
    }

    public void processToken(String token) {
        if (token.equals("+")) {
            ComplexNumber b = stack.pop();
            ComplexNumber a = stack.pop();
            stack.push(a.add(b));
        } else if (token.equals("-")) {
            ComplexNumber b = stack.pop();
            ComplexNumber a = stack.pop();
            stack.push(a.subtract(b));
        } else if (token.equals("*")) {
            ComplexNumber b = stack.pop();
            ComplexNumber a = stack.pop();
            stack.push(a.multiply(b));
        } else {
            stack.push(new ComplexNumber(Double.parseDouble(token.split("\\+")[0]),
                                         Double.parseDouble(token.split("\\+")[1].split("i")[0])));
        }
    }

    public ComplexNumber getResult() {
        return stack.pop();
    }

    public static void main(String[] args) {
        PolishCalculator calculator = new PolishCalculator();
        String[] input = { "2+3i", "3+4i", "-", "5+6i", "+" };
        for (String token : input) {
            calculator.processToken(token);
        }
        System.out.println(calculator.getResult());
    }
}