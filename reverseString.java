import java.util.Arrays;
public class reverseString {
    static void reverse(char[] s){
        int left=0,right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverse(s);
        System.out.println("After Reverse:  " + Arrays.toString(s));

    }
}
