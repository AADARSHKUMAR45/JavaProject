import java.util.Scanner;
class leep
{
    public static void main(String[] arg)
    {   int year;
        System.out.println("enter the year");
        Scanner obj=new Scanner(System.in);
        year=obj.nextInt();
        if(year%4==0)
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }

    }
}