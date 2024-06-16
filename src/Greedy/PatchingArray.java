package Greedy;

public class PatchingArray {
    public static void main(String[] args) {
        int[] nums = {1,5,10};
        int n = 20;

    }
    public int minPatches(int[] nums, int n) {
       long mR  = 0; //we declare long because the value of mR can be very large
       int i = 0;
       int patches = 0;

       while(mR < n){ //we will keep on adding the elements from the array until we reach the target value
           if(i < nums.length && nums[i] <= mR + 1){ //if the element is less than or equal to mR + 1 then we will add the element to mR
               mR += nums[i]; //add the element to mR to increase the value of mR
               i++; //increment the value of i
           } else {
               mR += (mR+1); //if the element is greater than mR + 1 then we will add mR + 1 to mR
               patches++; //increment the value of patches as the elements are not able to satisfy the condition and we need to add the element to the array
               //it does not matter which element we add to the array as we can add any element to the array
           }
       }
       return patches;

    }
}
