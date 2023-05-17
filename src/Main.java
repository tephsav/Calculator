public class Main {
    public static void main(String[] args) {
        String expression = Expression.getExpression();
        String result = calc(expression);
        System.out.println(result);
    }

    public static String calc(String input) {
        String result = "";

        try {
            Expression.checkExpression(input);
            String[] elements = input.split(" ");
            boolean isArabicSystem = Expression.isArabicNumbers(elements[0], elements[2]);

            if (isArabicSystem) {
                int firstNumber = Integer.parseInt(elements[0]);
                int secondNumber = Integer.parseInt(elements[2]);
                result = String.valueOf(Calculator.calculate(firstNumber, elements[1], secondNumber));
            } else {
                int firstNumber = Converter.romanToArabic(elements[0]);
                int secondNumber = Converter.romanToArabic(elements[2]);
                int value = Calculator.calculate(firstNumber, elements[1], secondNumber);
                Expression.checkPositiveRomanNumber(value);
                result = Converter.arabicToRoman(value);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
}
