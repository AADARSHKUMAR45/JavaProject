public class arr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[4] = 10;
        int max1=arr[0];
        int max2 =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            } 
            else if(arr[i]>max2 && arr[i]!=max1){
                max2=arr[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max1);
        System.out.println("Second maximum element in the array is: " + max2);
    }
}