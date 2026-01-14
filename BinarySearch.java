public class BinarySearch {
    static int Search(int arr[] , int target){
        int Start=0,end=arr.length-1;
        while(Start<=end){
            int mid=Start+end/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                Start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] arr={5,6,7,8,9,10,12,15};
        int target=8;
        System.out.println(Search(arr,target));

    }
}
