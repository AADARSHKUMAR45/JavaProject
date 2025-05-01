import java.util.Scanner;
class numberulata{
    public static void main(String[] arg)
    {
        int num,i,j;
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        for(i=num;i>=1;i--)
        {
            for(j=i;j>= 1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}