import java.util.*;

public class Example4new {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: ");
        while (true) {
            String input = in.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            StringTokenizer tokenizer = new StringTokenizer(input, " ", true);
            while (tokenizer.hasMoreTokens()) {
                try {
                    String expression = tokenizer.nextToken().trim();
                    if (!expression.isEmpty()) {
                        evaluateExpression(expression);
                    }
                } catch (NoSuchElementException nsee) {
                    System.out.println("Invalid syntax");
                }
            }
        }
    }
    private static void evaluateExpression(String expression) {
        double leftOperand, result, rightOperand;
        String leftString, operator, rightString;
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);
        try {
            leftString = tokenizer.nextToken().trim();
            operator = tokenizer.nextToken().trim();
            rightString = tokenizer.nextToken().trim();

            try {
                leftOperand = Double.parseDouble(leftString);
            } catch (NumberFormatException nfe) {
                System.out.println("Left operand '" + leftString + "' is not a number");
                return;
            }

            try {
                rightOperand = Double.parseDouble(rightString);
            } catch (NumberFormatException nfe) {
                System.out.println("Right operand '" + rightString + "' is not a number");
                return;
            }if (operator.equals("+")) {
                result = leftOperand + rightOperand;
            } else if (operator.equals("-")) {
                result = leftOperand - rightOperand;
            } else if (operator.equals("*")) {
                result = leftOperand * rightOperand;
            } else if (operator.equals("/")) {
                if (rightOperand == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = leftOperand / rightOperand;
            } else {
                System.out.println("Invalid operator: " + operator);
                return;
            }

            System.out.println("Result: " + result);
        } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax in expression: " + expression);
        }
    }
}
/* if (!tokenizer.hasMoreTokens()) {
            throw new IllegalArgumentException("Invalid syntax in expression: " + expression);
        }

        leftString = tokenizer.nextToken().trim();
        if (!tokenizer.hasMoreTokens()) {
            throw new IllegalArgumentException("Invalid syntax in expression: " + expression);
        }
        operator = tokenizer.nextToken().trim();
        if (!tokenizer.hasMoreTokens()) {
            throw new IllegalArgumentException("Invalid syntax in expression: " + expression);
        }
        rightString = tokenizer.nextToken().trim();

        leftOperand = parseOperand(leftString, "Left operand '" + leftString + "' is not a number");
        rightOperand = parseOperand(rightString, "Right operand '" + rightString + "' is not a number");

*/