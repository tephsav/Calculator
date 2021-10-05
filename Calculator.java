public class Calculator {
    public static int calculate(String[] elements){
        int firstNumber = Integer.parseInt(elements[0]);
        String operator = elements[1];
        int secondNumber = Integer.parseInt(elements[2]);
        int result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
        }

        return result;
    }
}
