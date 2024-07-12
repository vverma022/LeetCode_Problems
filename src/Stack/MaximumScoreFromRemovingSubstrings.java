package Stack;

import java.util.Stack;

public class MaximumScoreFromRemovingSubstrings {
    public static void main(String[] args) {

    }
    public static int maximumGain(String s, int x, int y) {

        String max;
        String min;
        if(x > y){
            max = "ab";
            min = "ba";
        } else {
            max = "ba";
            min = "ab";
        }
        int score = 0;

        String main = Stack(max,s);
        int left = (s.length() - main.length())/2;
        score += left * Math.max(x,y);

        String remain = Stack(min,main);
        int left2 = (main.length() - remain.length())/2;
        score += left2 * Math.min(x,y);

        return score;
    }
    public static String Stack(String sub, String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && ch == sub.charAt(1) && stack.peek() == sub.charAt(0)){
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder remaining = new StringBuilder();
        while(!stack.isEmpty()){
            remaining.append(stack.pop());
        }
        return remaining.reverse().toString();
    }
}
