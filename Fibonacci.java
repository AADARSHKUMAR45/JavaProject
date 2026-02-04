public class Fibonacci {
    static int fib(int n){
        if(n==0 ||n==1) return n;
        int fn1=fib(n-1);
        int fn2=fib(n-2);
        int fn3=fn2+fn1;
        return fn3;
    }

        public static void main(String[] args) {
        int n=22;
        System.out.println(fib(n));

    }
}
