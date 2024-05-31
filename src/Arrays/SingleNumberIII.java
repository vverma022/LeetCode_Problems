package Arrays;

import java.util.HashMap;

public class SingleNumberIII {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] ans = singleNumber(nums);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] ans = new int[2];
        int index = 0;
        for(int key: map.keySet()){
            if(map.get(key) == 1){
                ans[index++] = key;
            }
        }
        return ans;
    }
}
