import java.util.Scanner;
public class 5Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        int ans;
        char operation;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first number and press Enter: ");
        num1 = reader.nextInt();
        System.out.print("Enter second number and press Enter: ");
        num2 = reader.nextInt();

        System.out.print("Enter an operator and press Enter(+, -, *, /): ");

        operation = reader.next().charAt(0);
        switch(operation) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;


            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("The result is given as follows:");
        System.out.printf(num1 +" "+ operation +" "+ num2 + " = "+ ans);
    }
}