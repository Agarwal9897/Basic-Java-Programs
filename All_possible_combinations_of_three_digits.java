class possible {
    public static void main(String args[]){
        int num[]=new int[3];
        for(int i=0;i<3;i++)
        {
            num[i]=Integer.parseInt(args[i]);
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if(num[i]!=num[j] && num[j]!=num[k] && num[k]!=num[i] )
                        System.out.println(num[i]+" "+num[j]+" "+num[k]);
                }
            }
        }
    }   
}
