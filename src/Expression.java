import java.util.Scanner;

public class Expression {
    static final String structureRegex = "-?\\w+ [-+*/] -?\\w+";
    static final String arabicRegex = "[1-9]|10";
    static final String romanRegex = "I{1,3}|I?V|VI{1,3}|I?X";

    static String getExpression() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static void checkExpression(String input) throws Exception {
        Expression.checkStructure(input);
        String[] elements = input.split(" ");
        Expression.checkOperands(elements[0], elements[2]);
        Expression.checkEqualNumberSystem(elements[0], elements[2]);
    }

    static void checkStructure(String input) throws Exception {
        boolean isExpression = input.matches(structureRegex);

        if (!isExpression) {
            throw new Exception("Неправильная структура выражения");
        }
    }

    static void checkOperands(String operand1, String operand2) throws Exception {
        boolean isFirstNumber = operand1.matches(arabicRegex) || operand1.matches(romanRegex);
        boolean isSecondNumber = operand2.matches(arabicRegex) || operand2.matches(romanRegex);
        boolean isNumbers = isFirstNumber && isSecondNumber;

        if (!isNumbers) {
            throw new Exception("Числа не соответствуют требованиям");
        }
    }

    static void checkEqualNumberSystem(String operand1, String operand2) throws Exception {
        boolean isArabicEqual = operand1.matches(arabicRegex) && operand2.matches(arabicRegex);
        boolean isRomanEqual = operand1.matches(romanRegex) && operand2.matches(romanRegex);
        boolean isOneNumberSystem = isArabicEqual != isRomanEqual;

        if (!isOneNumberSystem) {
            throw new Exception("Числа разных систем счисления");
        }
    }

    static boolean isArabicNumbers(String operand1, String operand2) {
        return operand1.matches(arabicRegex) && operand2.matches(arabicRegex);
    }

    static void checkPositiveRomanNumber(int number) throws Exception {
        if (number < 1) {
            throw new Exception("Неположительного числа в римской системе счисления не существует");
        }
    }
}
