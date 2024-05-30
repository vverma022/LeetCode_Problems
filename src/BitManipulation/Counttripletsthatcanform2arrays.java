package BitManipulation;

public class Counttripletsthatcanform2arrays {
    public static void main(String[] args) {

    }
    public static int countTriplets(int[] arr) {
        int[] narr = new int[arr.length + 1];
        narr[0] = 0;
        int n = narr.length;

        for(int i = 1; i < n;i++){
            narr[i] = narr[i - 1] ^ arr[i - 1];
        }
        int ans = 0;
        /*
        We know that the xor of a subarray from i to j is narr[i] ^ narr[j + 1]
        and if narr[i] == narr[j + 1] then the xor of the subarray from i to j is 0
        so we need to find the number of pairs of i and j such that narr[i] == narr[j + 1]
        that is why ans += k - j - 1 because we need to find the number of pairs of i and j
        and k is the index of the element that is equal to narr[j] and k > j

         */
        for(int j = 0; j < n;j++ ){
            for(int k = j+1;k < n;k++){
                if(narr[j] == narr[k]){
                    ans += k - j - 1;
                }
            }
        }
        return ans;
    }

}
