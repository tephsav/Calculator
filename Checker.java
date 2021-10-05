public class Checker {
    public static void checkExpression(String expression) throws Exception {
        boolean result = expression.matches("-?\\d+ [-+/*] -?\\d+");
        if (!result) {
            throw new Exception("Incorrect expression format, must be two integer operands and one operator (+, -, /, *), separated by spaces");
        }
    }

    public static void checkOperands(String op1, String op2) throws Exception {
        int firstNumber = Integer.parseInt(op1);
        int secondNumber = Integer.parseInt(op2);
        boolean isFirstNumber = firstNumber > 0 && firstNumber <= 100;
        boolean isSecondNumber = secondNumber > 0 && secondNumber <= 100;

        if (!(isFirstNumber && isSecondNumber)) {
            throw new Exception("Incorrect format, must be positive (1-100) integer number notation");
        }
    }
}
