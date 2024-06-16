package Greedy;

import java.util.Arrays;

public class Bagoftokens {
    public static void main(String[] args) {

    }
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int score = 0;
        int maxScore = 0;
        int i = 0;
        int j = tokens.length - 1;
        while(i <= j){
            if(P >= tokens[i]){
                P -= tokens[i];
                score++;
                i++;
                maxScore = Math.max(maxScore, score);
            }else if(score > 0){
                score--;
                P += tokens[j];
                j--;
            }else{
                break;
            }
        }
        return maxScore;
    }
}
