package Strings;

import java.util.HashMap;
import java.util.Hashtable;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));

    }
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1); //Store the frequency of each character
        }
        int ans = 0;
        boolean odd = false;
        for(char c : map.keySet()){
            if(map.get(c) % 2 == 0){ //if the frequency of the character is even we can add it to the palindrome
                ans += map.get(c);
            }else{
                ans += map.get(c) - 1; //if not we can add the frequency - 1 to the palindrome
                odd = true;
            }
        }
        return odd ? ans + 1 : ans;
    }
}
