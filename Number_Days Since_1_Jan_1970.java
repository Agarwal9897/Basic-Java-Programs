import java.util.Scanner;
class numdays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date: ");
        int date=sc.nextInt();
        System.out.print("Enter Month: ");
        int mon=sc.nextInt();
        System.out.print("Enter Year: ");
        int year=sc.nextInt();
        int current_years=year;
        int days=0;
        int leap_years=0;
        int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<mon-1;i++)
            days=days+months[i];
        days=days+((year-1970)*365)+date;
        if(mon<=2)
            current_years=current_years-1;
        for(int i=1970;i<=current_years;i++)
        {
            if(i%4==0)
            {
                if(i%100==0)
                {
                    if(i%400==0)
                        leap_years=leap_years+1;
                }
                else
                    leap_years=leap_years+1;
            }
        }
        days=days+leap_years;
        System.out.println("Number of days: "+days);
    }
    
}
