public class bubbleSort {
    static void BubbleSort(int[] arr){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int i=0;i<arr.length-turn-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,2,3,1};
        BubbleSort(arr);
        print(arr);
    }

}
