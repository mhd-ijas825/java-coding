/* public class function {
    public static int ijas(int a,int b){
        int res=1;
        for(int i=1 ; i<=b ; i++){
            res*=a;      
        }
        return(res);
    }
    public static void main(String args[]){ 
    System.out.println(ijas(4,2));
    }
}  
16  
*/


/* public class function{
    public static double ijas(double r){
        double pi=3.14;
        double i = 2*pi*r;
        return(i);
    }
    public static void main(String[] args) {
        System.out.println(ijas(6));
    }
}
37.68
*/

/* public class function{
    public static int ijas(int a){
        int count=0;
        while(a  != 0){
            count++;
            a=a/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(ijas(5575846));
    }
}
7
*/

/* public class function{
    public static int ijas(int i){
        
        int rem;
        int res=0;
        while(i != 0){
            rem=i%10;
            res=res*10+rem;
            i/=10;
        }
        return(res);
    }
    public static void main(String[] args) {
        System.out.println(ijas(1234));
    }
}
4321
*/

import java.util.Scanner;

public class function{    
    public static void main(String[] args) {
        Scanner ijas=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=ijas.nextInt(); 
        isArmstrong(a);
    }
    static void isArmstrong(int a){}
    static void count(){
        int count=0;
        int temp=a;
        int temp2=a;
        while(temp != 0){
            temp=temp/10;
            count++;
        }
    }
        double sum=0;
        while(temp2!=0){
            int rem=temp2%10;
            sum=Math.pow(rem, count)+sum;
            temp2=temp2/10;
        }
        if(a==sum){
            System.out.println("its a armstrong");
        }    
        else{
            System.out.println("its not a armstrong");
        }  
    
}
