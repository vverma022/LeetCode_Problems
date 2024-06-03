package Strings;

public class AppendCharacterstoStringtoSubsequence {
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";
        System.out.println(appendCharacters(s, t));
    }
    public static int appendCharacters(String s, String t) {
        int first = 0; //Character in s
        int added  = 0; //Character in t
        while(first < s.length() && added < t.length()){
            if(s.charAt(first) == t.charAt(added)){
                //if the character in s is equal to the character in t
                //it means that the character in s is a subsequence of t or present in t
                added++;
            }
            first++; //if not equal, move to the next character in s as the character in s is not present in t
        }
        return t.length() - added; //the number of characters that are not present in t
    }
}
