public class fibonacci {
    public static void main(String[] args) {
        int n=6;
        int p=0;
        int c=1;
        int next;
        System.out.println(p);
        System.out.println(c);
        for(int i=0 ; i<n ; i++){
            next=p+c;
            System.out.print(next);
            p=c;
            c=next;
        }
    }
    
}
