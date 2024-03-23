package ru.levandr.Beans.Calculator;

public class Calculator {

    Integer lhs;
    Integer rhs;
    Expression expression;

    public Calculator() {
    }

    public Integer getLhs() {
        return lhs;
    }

    public void setLhs(Integer lhs) {
        this.lhs = lhs;
    }

    public Integer getRhs() {
        return rhs;
    }

    public void setRhs(Integer rhs) {
        this.rhs = rhs;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void calculateIntegers(int lhs, int rhs, Expression expression) {

        switch (expression) {
            case PLUS -> System.out.printf("Результат %d + %d = %d%n", lhs, rhs, lhs + rhs);
            case MINUS -> System.out.printf("Результат %d + %d = %d%n", lhs, rhs, lhs - rhs);
            case DIVISION -> {
                if (lhs == 0 || rhs == 0) {
                    throw new IllegalArgumentException("Division by Zero is not allowed");
                }
                System.out.printf("Результат %d / %d = %d%n", lhs, rhs, lhs / rhs);
            }
            case Exponentiation -> System.out.printf("Результат %d ^ %d = %d%n", lhs, rhs, (long) Math.pow(lhs, rhs));
            case MULTIPLICATION -> System.out.printf("Результат %d * %d = %d%n", lhs, rhs, lhs * rhs);
            default -> throw new IllegalArgumentException("Unsupported operation");
        }
    }
}
