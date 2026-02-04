public class decreaseno {
    static void reverse(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        reverse(n-1);
    }
    static void reverse1ins(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        reverse1ins(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args){
        int n=10;
        reverse(n);
        reverse1ins(n);
    }
}
