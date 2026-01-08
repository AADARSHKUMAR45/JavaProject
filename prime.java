public class prime {
    static boolean isPrime(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i - 1);
    }

    public static void main(String[] args) {
        int n = 16;
        if (isPrime(n, n / 2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}