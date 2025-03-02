/* public class pattern {
    public static void main(String[] args) {
        for (int i = 1; i<=5 ; i++){
            for(int j=1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
*
**
***
****
***** 
*/

/* public class pattern {
    public static void main(String[] args) {
        for (int i = 1; i<=5 ; i++){
            for(int j=1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
1
12
123
1234
12345 
*/

/* public class pattern {
    public static void main(String[] args) {
        for (int i = 1; i<=5 ; i++){
            for(int j=5 ; j >= i ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
54321
5432
543
54
5 
*/

/* public class pattern {
    public static void main(String[] args) {
        for (int i = 5; i>=1 ; i--){
            for(int j=5 ; j >= i ; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
5
44
333
2222
11111 
*/

/* public class pattern {
    public static void main(String[] args) {
        for (int i = 5; i>=1 ; i--){
            for(int j=5 ; j >= i ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
5
54
543
5432
54321
 */

 /* public class pattern {
    public static void main(String[] args) {
        for(int i=1 ; i <= 7 ; i++){
            for(int space=7 ; space>=i ; space--){
                System.out.print(" ");
                if(space == i){
                    for(int star=1 ; star<=i ; star++){
                        System.out.print("*");
                    }
                }
            }
           System.out.println("");
        }
    }
}
       *
      **
     ***
    ****
   *****
  ******
 *******  */


 /* public class pattern {
    public static void main(String[] args) {
        for(int i=1 ; i <= 7 ; i++){
            for(int space=7 ; space>=i ; space--){
                System.out.print(" ");
                if(space == i){
                    for(int star=1 ; star<=i ; star++){
                        System.out.print("* ");
                    }
                }
            }
           System.out.println("");
        }
    }
}  
      * 
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *
* * * * * * *  */


/*  public class pattern {
    public static void main(String[] args) {
        for(int i=7 ; i >= 1 ; i--){
            for(int space=7 ; space>=i ; space--){
                System.out.print(" ");
                if(space == i){
                    for(int star=1 ; star<=i ; star++){
                        System.out.print("*");
                    }
                }
            }
           System.out.println("");
        }
    }
}
*******
 ******
  *****
   ****
    ***
     **
      * 
*/

/* public class pattern {
    public static void main(String[] args) {
        for(int i=7 ; i >= 1 ; i--){
            for(int space=7 ; space>=i ; space--){
                System.out.print(" ");
                if(space == i){
                    for(int star=1 ; star<=i ; star++){
                        System.out.print(star);
                    }
                }
            }
           System.out.println("");
        }
    }
}
 1234567
  123456
   12345
    1234
     123
      12
       1 
*/

/* public class pattern {
    public static void main(String[] args) {
        for(int i=1 ; i <= 7 ; i++){
            for(int space=7 ; space>=i ; space--){
                System.out.print(" ");
                if(space == i){
                    for(int star=1 ; star<=(2*i-1) ; star++){
                        System.out.print("*");
                    }
                }
            }
           System.out.println("");
        }
    }
} 
      *
     ***
    *****
   *******
  *********
 ***********
************* 
*/

 public class pattern {
    public static void main(String[] args) {
        for(int i=7 ; i >= 1 ; i--){
            for(int space=7 ; space>=i ; space--){
                System.out.print(" ");
                if(space == i){
                    for(int star=1 ; star<=i ; star++){
                        System.out.print("");
                    }
                }
            }
           System.out.println(i);
        }
    }
}  