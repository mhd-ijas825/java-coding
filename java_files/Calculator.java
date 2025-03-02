import java.util.*;
class Calculator {
    public static void main(String args[])
    {
        Scanner num1 = new Scanner(System.in);
        System.out.print("enter a first number:");
        int a= num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.print("enter a second number:");
        int b= num2.nextInt();
        Scanner operator = new Scanner(System.in);
        System.out.print("enter a operator:");
        String op = operator.nextLine();
        char sym = op.charAt(0);
        switch(sym)
        {
            case '+':
            System.out.println(a+b);
            break;

            case '-' :
            System.out.println(a-b);
            break;

            case '*' :
            System.out.println(a*b);
            break;

            case '/' :
            System.out.println(a/b);
            break;

            default:
            System.out.println("no values");
        }
    } 
}
