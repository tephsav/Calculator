import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Expression:\t");
        String expression = sc.nextLine();

        try{
            Checker.checkExpression(expression);
            String[] elements = expression.split(" ");
            Checker.checkOperands(elements[0], elements[2]);
            int result = Calculator.calculate(elements);
            System.out.println(result);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}