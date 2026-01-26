import java.util.Scanner;

public class D2Array {
    static boolean searchkey(int Matrix [] [],int key){
        for(int j=0;j<Matrix.length;j++){
            for(int k=0;k<Matrix[0].length;k++) {
                if (Matrix[j][k] == key) {
                    System.out.println(Matrix[j][k]);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int Matrix[] []=new int[3][3];
        int key=7;
        searchkey(Matrix ,key );
        int n=Matrix.length,m=Matrix[0].length;
        Scanner sc=new Scanner(System.in);
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               Matrix[i][j]=sc.nextInt();
           }
       }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
}
    }
}
