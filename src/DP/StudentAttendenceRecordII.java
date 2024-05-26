package DP;

import java.util.Arrays;

import static Backtracking_Recursion.MaximumScoreWordsFormedbyLetters.solve;

public class StudentAttendenceRecordII {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(checkRecord(n));

    }
    static int M = 1000000007;
    static int[][][] dp = new int[100001][2][3];
    public static int checkRecord(int n) {
        for (int i = 0; i < 100001; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return recur(n, 0, 0);
    }

    private static int recur(int n,int absents, int consecutiveLate) {

        if(absents >= 2 || consecutiveLate >= 3) {
            return 0;
        }

        if(n == 0)
            return 1;

        if(dp[n][absents][consecutiveLate] != -1) {
            return dp[n][absents][consecutiveLate];
        }

        int A = recur(n-1, absents+1, 0) % M;
        int L = recur(n-1, absents, consecutiveLate+1) % M;
        int P = recur(n-1, absents, 0) % M;

        return dp[n][absents][consecutiveLate] = ((A + L) % M + P) % M;

    }
}
