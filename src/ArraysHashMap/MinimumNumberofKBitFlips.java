package ArraysHashMap;

public class MinimumNumberofKBitFlips {
    public static void main(String[] args) {

    }
    public static int minKBitFlips(int[] nums, int k) {
        int flips = 0; // number of flips
        int n = nums.length; // length of nums
        boolean[] isflip = new boolean[n]; // boolean array to keep track of flips
        int currentflip = 0;

        for(int i = 0; i < n; i++){
            if(i >= k && isflip[i-k]){ //if the index is more than k then we can now again flip the bit
                currentflip--;        // so we decrement the currentflip

            }
            if(currentflip % 2 == nums[i]){ // if the currentflip is even and the number is 0 or if the currentflip is odd and the number is 1
                if(i + k > n){  //because if current flip is even bit is 0 it will again become 0
                    return -1;
                }
                currentflip++;
                flips++;
                isflip[i] = true;
            }

        }

        return flips;

        //Time complexity is O(n)
        //Space complexity is O(n)
    }
}
