package ArraysHashMap;

import java.util.HashMap;

public class ContinousSubArraySum {
    public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));

    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //We know that the modulo of 2 numbers is same even if we add a multiple of k to any of the numbers
        //for example 23 % 6 = 5 and 29 % 6 = 5, so we see that 29 - 23 = 6 which is a multiple of k
        int sum = 0;
        map.put(0, -1); //This is to handle the case when the sum is a multiple of k and also so that n - (-1) > 1
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(k != 0) { //If k is 0 then we can't divide by 0
                sum = sum % k; //We are storing the modulo of the sum
            }
            if(map.containsKey(sum)) { //If we have seen the sum before then we check if the difference between the current index and the previous index is greater than 1
                if(i - map.get(sum) > 1) {
                    return true;
                }
            } else { //If we haven't seen the sum before then we store the sum and the index
                map.put(sum, i);
            }
        }
        return false;

       

    }
}
