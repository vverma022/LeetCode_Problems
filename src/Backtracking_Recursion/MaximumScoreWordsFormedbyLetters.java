package Backtracking_Recursion;

import java.util.Arrays;

public class MaximumScoreWordsFormedbyLetters {
    static int maxVal;
    static int n;
    public static void main(String[] args) {
        String[] words = {"dog","cat","dad","good"};
        char[] letters = {'a','a','c','d','d','d','g','o','o'};
        int[] score = {1,0,9,5,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(maxScoreWords(words, letters, score));
    }
    public static int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq = new int[26];

        for (char ch : letters){
            freq[ch - 'a']++;
        }
        int maxScore = Integer.MIN_VALUE;
         n = words.length;

         solve(0,score,words,0,freq);


        return maxVal;
    }

    public static void solve(int i, int[] score, String[] words, int currScore , int[] freq) {
        maxVal = Math.max(maxVal, currScore);
        if(i >= n) return;

        int[] tempfreq = Arrays.copyOf(freq,freq.length); //to change the freq array
        int j = 0;
        int tempScore = 0;

        while (j < words[i].length()){
            char ch = words[i].charAt(j);
            tempfreq[ch - 'a']--;
            if(tempfreq[ch - 'a'] < 0){
                break;
            }
            j++;
        }
        if(j == words[i].length()){ //it means we can form the word
            solve(i + 1, score, words, currScore + tempScore, tempfreq);
        }
        //not including the word
        solve(i + 1, score,words, currScore, freq);
    }

}
