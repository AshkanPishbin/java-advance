import division.DivisionCalculator;
import multiplication.MultiplicationCalculator;
import subtraction.SubtractionCalculator;
import summation.SumCalculator;

public class Calculator {
    private DivisionCalculator divisionCalculator = new DivisionCalculator();
    private MultiplicationCalculator multiplicationCalculator = new MultiplicationCalculator();
    private SumCalculator sumCalculator = new SumCalculator();
    private SubtractionCalculator subtractionCalculator = new SubtractionCalculator();

    public Double calculate(Double number1, Double number2, String symbol) {
        if (symbol.contains("+")) {
            return sumCalculator.calculate(number1, number2);
        }
        if (symbol.contains("-")) {
            return subtractionCalculator.subtract(number1, number2);
        }
        if (symbol.contains("*")) {
            return multiplicationCalculator.multiply(number1, number2);
        }
        if (symbol.contains("/")) {
            return divisionCalculator.divide(number1, number2);
        }
        throw new IllegalArgumentException("Symbol not supported: " + symbol);
    }
}

