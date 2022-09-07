// Code For Fibonacci Series upto n numbers
import java.util.Scanner;
class fibonacci					
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        a= 1;
        b=1;
        if(n==1)
        {
            System.out.println(a);
        }
        if(n==2)
        {
            System.out.println(a);
            System.out.println(b);
        }
        else
        {
            System.out.println(a);
            System.out.println(b);

            for(int i=0;i<n-2;i++)
            {
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            } 
        }   
    }
}