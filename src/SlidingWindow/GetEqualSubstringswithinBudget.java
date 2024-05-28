package SlidingWindow;

public class GetEqualSubstringswithinBudget {
    public static void main(String[] args) {
        int maxCost = 3;
        String s = "abcd";
        String t = "bcdf";
        System.out.println(equalSubstring(s, t, maxCost));

    }
    public static int equalSubstring(String s, String t, int maxCost) {
      int[] cost = new int[s.length()];
      char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for(int i = 0; i < s.length(); i++){
            cost[i] = Math.abs(sArr[i] - tArr[i]);
        }
        int right = 0;
        int left = 0;
        int costSum = 0;
        int max = 0;
        while(right < s.length()){
            costSum += cost[right];
            while(costSum > maxCost){
                costSum -= cost[left];
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
