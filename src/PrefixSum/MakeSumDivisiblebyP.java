package PrefixSum;

import java.util.HashMap;

public class MakeSumDivisiblebyP {
    public static void main(String[] args) {
        int[] nums = {3,1,4,2};
        int p = 6;
        System.out.println(minSubarray(nums,p));

    }
    public static int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum = (sum + nums[i]) % p;
        }

        sum = sum % p;
        if(sum == 0){
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int ans = n;
        int val = 0;

        for(int j = 0; j < n; j++){
            val = (val + nums[j]) % p;

            int rem = (val - sum + p) % p;
            if(map.containsKey(rem)){
                ans = Math.min(ans,j - map.get(rem));
            }
            map.put(val,j);
        }

        return ans == n ? -1 : ans;
    }
}
