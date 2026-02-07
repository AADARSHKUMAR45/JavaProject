import java.util.*;

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));

            if (i < s.length() - 1 && curr < map.get(s.charAt(i + 1))) {
                total -= curr;
            } else {
                total += curr;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman numeral: ");
        String input = sc.nextLine();

        int result = romanToInt(input);

        System.out.println("Integer value = " + result);
    }
}
