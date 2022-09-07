import java.util.Scanner;
class greater
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a=sc.nextInt();
        System.out.print("Enter First Number: ");
        int b=sc.nextInt();
        System.out.print("Enter First Number: ");
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is greatest");
            }
            else if(c>a)
            {
                
                    System.out.println("C is greatest");
                
            }
        }
        else if(b>a)
        {
            if(b>c)
            {
                System.out.println("B is greatest");
            }
            else if(c>b)
            {
                
                    System.out.println("C is greatest");
            }
        }
        else if(c>a)
        {
            if(c>b)
            {
                System.out.println("C is greatest");
            }
        }
    }
}