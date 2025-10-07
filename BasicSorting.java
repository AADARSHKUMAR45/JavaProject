import java.util.*;
class BasicSorting {
    public static void Bubblesort(int arr1[]){
        for(int turn=0;turn<arr1.length-1;turn++){
            for(int j=0;j<arr1.length-1-turn;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
    }
    public static void print1(int arr1[])
    {
        for(int i=0;i<arr1.length;i++){
            System.out.print(i+" ");

        }
        System.out.println(" ");

        
    }
    public static void main(String[] args) {
        int arr1[]={5,4,1,3,2};
        Bubblesort(arr1);
        print1(arr1);
    }
}
