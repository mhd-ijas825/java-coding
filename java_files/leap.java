class leap{
    public static void main(String args[])
    {
        int a=5008;
        if(((a%4==0)&&(a%100!=0))||a%400==0)
        {
            System.out.println("Is a leap year");
        }
        else{
            System.out.println("Is not a leap year");
        }
    }
}