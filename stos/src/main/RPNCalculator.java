package main;

public class RPNCalculator {
    private final StackMethods stack = new StackMethods();

    public int evaluate(String expression) {
        for (String token : expression.split("\\s+")) {
            if (token.matches("-?\\d+")) {
                stack.pushString(token);
            } else {
                stack.pushString(String.valueOf(
                        applyOperator(Integer.parseInt(stack.popString()), Integer.parseInt(stack.popString()), token)
                ));
            }
        }
        return Integer.parseInt(stack.popString());
    }

    private int applyOperator(int b, int a, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new IllegalArgumentException("Nieznany operator: " + operator);
        };
    }
}
