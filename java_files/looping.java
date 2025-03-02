class looping 
{
    public static void main(String[] args)
    {
        int i;
        for(i=5; i>=1 ; i--)
        {
            switch(i){
            case 1:
            System.out.println("monday");
            break;

            case 2:
            System.out.println("tuesday");
            break;

            case 3:
            System.out.println("wednaesday");
            break;

            case 4:
            System.out.println("thursday");
            break;

            default:
            System.out.println("holiday");
            }
        }
    }
}
