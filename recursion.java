public class recursion {
    static int sum(int[] n, int index){
        if(index==0){
            return 0;
        }
        else{
            return n[index-1]+sum(n,index-1);
        }
    }
    public static void main(String[] args) {
       int [] n={4,5,6,7,8};
       System.out.println(sum(n,n.length));
    }
}