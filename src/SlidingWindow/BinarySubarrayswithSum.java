package SlidingWindow;

import java.util.HashMap;

public class BinarySubarrayswithSum {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums,goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int ans = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i = 0; i < n; i++){
            sum += nums[i];
            int rem = sum - goal;

            if(map.containsKey(rem)){
                ans += map.get(rem);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return ans;

    }
}
