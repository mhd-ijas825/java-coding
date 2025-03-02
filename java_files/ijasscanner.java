import java.util.Scanner;

class ijasscanner
{
    public static void main(String args[])
    {
        Scanner ijas = new Scanner(System.in);
        System.out.print("enter a value:");
        int a=ijas.nextInt();
        System.out.print("enter b value:");
        int b=ijas.nextInt();
        System.out.print("the total value is:");
        System.out.println(a+b);
    }
}
