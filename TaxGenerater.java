import java.util.Scanner;

public class TaxGenerater {
    public static void main( String[] args ){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your Income");
        int income=input.nextInt();
        int tax;
        if(income<500000){
            tax=0;
        }
        else if(income>500000 && income<100000){
            tax= (int) (income*0.2);
        }
        else{
            tax=(int) (income*0.3);
        }
        System.out.println("TAx is"+tax);
    }
}
