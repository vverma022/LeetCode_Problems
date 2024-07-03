package ArraysHashMap;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.Arrays;

public class MinimumDiffrenceBetweenLargestandSmallestin3move {
    public static void main(String[] args) {
     int[] nums = {1,5,0,10,14};
          System.out.println(minDifference(nums));
    }
    public static int minDifference(int[] nums) {
      if (nums.length <= 4) {
                return 0;
            }
            Arrays.sort(nums);
            int result = Integer.MAX_VALUE;
            result = Math.min(result, nums[nums.length - 1] - nums[3]);
            result = Math.min(result, nums[nums.length - 2] - nums[2]);
            result = Math.min(result, nums[nums.length - 3] - nums[1]);
            result = Math.min(result, nums[nums.length - 4] - nums[0]);
            return result;
    }
}
