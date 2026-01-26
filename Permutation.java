import java.util.Arrays;
public class Permutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        // STEP 1: Right se pehla chhota element dhoondo
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // STEP 2: Right side se thoda bada element dhoondo aur swap
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // STEP 3: i+1 se end tak reverse
        int left = i + 1;
        int right = n - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        System.out.println("Before: " + Arrays.toString(nums));

        nextPermutation(nums);

        System.out.println("After:  " + Arrays.toString(nums));
    }
}
