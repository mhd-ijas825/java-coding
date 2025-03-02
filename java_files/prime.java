import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner ijas = new Scanner(System.in);
        System.out.print("enter start value:");
        int a = ijas.nextInt();
        System.out.print("enter end value:");
        int b = ijas.nextInt();
        int isprime = 1;
        for( a=a ; a<=b ; a++){
            isprime = 1;
        for(  int j=2 ; j<a ; j++){
            if(a%j == 0){
            System.out.println(a+" not a prime number");
            isprime = 0;
            break;
            }
        }
    if (isprime == 1){
        System.out.println(a+" is a prime");
    }
    }
    }
}
