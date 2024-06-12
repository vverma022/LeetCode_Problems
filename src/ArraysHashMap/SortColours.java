package ArraysHashMap;

public class SortColours {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
    public static void sortColors(int[] nums) {

        for(int i =0 ; i < nums.length; i++){ //we are using selection sort
            for(int j = i + 1; j < nums.length; j++){ // we are comparing the elements
                if(nums[i] > nums[j]){ // if the element at i is greater than element at j then swap the elements
                    int temp = nums[i]; //swap the elements
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }


    }
}
