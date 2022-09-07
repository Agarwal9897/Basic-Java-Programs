class greater
{
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
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