class largearr{
    public static void main(String arg[]){
        int arr[]={4,6,5,4,87,9,8,4};
        int max1=arr[0];
        int max2=max1;
        for(int i=0;i<arr.length;i++){
            if(max1<arr[i]){
               max2=max1;
               max1=arr[i];
            }
            else if(max2<arr[i]){
                max2=arr[i];
            }
        }
        System.out.println("maximum array " + max1);
        System.out.println("2nd maxarr " + max2);
    }
}