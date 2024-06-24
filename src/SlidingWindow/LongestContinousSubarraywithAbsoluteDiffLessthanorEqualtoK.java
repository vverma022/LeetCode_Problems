package SlidingWindow;
import java.util.TreeMap;

public class LongestContinousSubarraywithAbsoluteDiffLessthanorEqualtoK {
    public static void main(String[] args) {
        int[] nums = {8,2,4,7};
        int limit = 4;
    }
    public static int longestSubarray(int[] nums, int limit) {
        int subarray = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int i = 0;
        int j = 0;

        while (i < nums.length) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); //put the element in the map
            if (map.lastKey() - map.firstKey() > limit) { //if the diffrence between the largs and the smallest element is greater than the limit
                //that mean the k will be there so we will remove the element from the map
                map.put(nums[j], map.get(nums[j]) - 1);
                if (map.get(nums[j]) == 0) { //if the element is 0 then we will remove the element from the map
                    map.remove(nums[j]);
                }
                j++;
            }
            subarray = Math.max(subarray, i - j + 1);
            i++;
        }
        return subarray;
    }
    }



