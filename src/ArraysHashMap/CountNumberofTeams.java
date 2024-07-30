package ArraysHashMap;

public class CountNumberofTeams {
    public static void main(String[] args) {
        int[]  rating = {2,5,3,4,1};
        System.out.println(numTeams(rating));
    }
    public static int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;

        for(int i = 1; i < n; i++){
            int lefts = 0;
            int leftg = 0;
            int rights = 0;
            int rightg = 0;

            for(int j = 0; j < i; j++){
                if(rating[j] < rating[i]){
                    lefts++;
                } else {
                    leftg++;
                }
            }

            for(int k = i+1; k < n; k++){
                if(rating[k] < rating[i]){
                    rights++;
                } else {
                    rightg++;
                }
            }
            count += (lefts * rightg) + (leftg * rights);
        }

        return count;
    }
}
