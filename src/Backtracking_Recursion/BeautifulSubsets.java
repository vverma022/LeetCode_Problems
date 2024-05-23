package Backtracking_Recursion;

import java.util.HashMap;

public class BeautifulSubsets {
    public static void main(String[] args) {
        int[] nums = {2,4,6};
        int k = 2;
        System.out.println(beautifulSubsets(nums, k));

    }
    public static int beautifulSubsets(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        return backtrack(nums, k, 0, hashMap);

    }

    private static int backtrack(int[] nums, int k, int i, HashMap hashMap) {
        if (k == 0) {
            return 1;
        }
        if (i == nums.length) {
            return 0;
        }
        int count = 0;
        if (hashMap.containsKey(nums[i])) {
            count += (int) hashMap.get(nums[i]);
        } else {
            count += backtrack(nums, k - 1, i + 1, hashMap);
            count += backtrack(nums, k, i + 1, hashMap);
        }
        hashMap.put(nums[i], count);
        return count;
    }
}
