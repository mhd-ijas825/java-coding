import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int[][]ijas=new int[3][3];
        Scanner in =new Scanner(System.in);
        for(int row=0 ; row<ijas.length ; row++){
            for(int col=0 ; col<ijas.length ; col++){
                System.out.println("enter the number "+row+""+col+" :");
                ijas[row][col]=in.nextInt();                
            }
        }
        for(int row=0 ; row<ijas.length ; row++){
            for(int col=0 ; col<ijas.length ; col++){
                int temp = ijas[row][col];
                ijas[row][col]=ijas[row][ijas[row].length-1-col];
                ijas[row][ijas[row].length-1-col]=temp;
            }
        }
       for(int row=0 ; row<ijas.length ; row++){
            for(int col=0 ; col<ijas.length ; col++){
               System.out.print(ijas[row][col]);
            }
            System.out.println("");
        }
    }
}
