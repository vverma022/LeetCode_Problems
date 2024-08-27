package SlidingWindow;

public class MaximumPointsYoucanObtainfromCards {
    public static void main(String[] args) {
     int[] cardPoints = {1,2,3,4,5,6,1};
     int k = 3;
        System.out.println(maxScore(cardPoints,k));
    }
    public static int maxScore(int[] cardPoints, int k) {
        int left = k - 1;
        int right = cardPoints.length - 1;
        int sum = 0;
        int max = 0;

        for(int i = 0; i < k; i++){
            sum += cardPoints[i];
        }

        max = sum;

        for(int j = 0; j < k; j++) {
            sum += (cardPoints[right] - cardPoints[left]);

            max = Math.max(max, sum);

            left -= 1;
            right -= 1;
        }
        return max;
    }
}
