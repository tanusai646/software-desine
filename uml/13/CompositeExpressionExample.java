// Component
abstract class Expression {
    public abstract double evaluate();
}

// Leaf
class Number extends Expression {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public double evaluate() {
        return value;
    }
}

// Composite
class Addition extends Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public Addition(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public double evaluate() {
        return leftOperand.evaluate() + rightOperand.evaluate();
    }
}

// Client code
public class CompositeExpressionExample {
    public static void main(String[] args) {
        Expression number1 = new Number(1);
        Expression number2 = new Number(2);
        Expression number3 = new Number(3);

        Expression sum1 = new Addition(number1, number2);
        Expression sum2 = new Addition(sum1, number3);

        System.out.println(sum2.evaluate());  // Output: 6
    }
}