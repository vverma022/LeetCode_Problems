package Arrays;

public class SpecialArraywithXelementsgreaterthen {
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(specialArray(nums));

    }
    public static int specialArray(int[] nums) {
        //we first find the numbers greater than or equal to i;
        //then we check if the count of such numbers is equal to i;
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            if (check(nums, i) == i) {
                return i;
            } else {
                continue;

            }

        }
        return -1;
    }
    public static int check(int[] nums, int i){
        int count = 0;
        for (int num : nums) {
            if (num >= i) {
                count++;
            }
        }
        return count;
    }
}
