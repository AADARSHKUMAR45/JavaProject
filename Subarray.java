public class Subarray {
    static void PrintSubArray(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i+1;j<arr.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++) {
                    System.out.print(arr[k] + " ");
                    sum+=arr[k];
                }
                System.out.print("sum is " +sum);
                ts++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("total subarray is "+ ts);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        PrintSubArray(arr);
    }
}
