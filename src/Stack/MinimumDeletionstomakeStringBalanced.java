package Stack;

import java.util.Stack;

public class MinimumDeletionstomakeStringBalanced {
    public static void main(String[] args) {
        String s = "bbaaaaabb";
        System.out.println(minimumDeletions(s));
    }
    public static int minimumDeletions(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        char st = ' ';
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(!stack.empty() && (stack.peek() == 'b' && c == 'a')){
                stack.pop();
                count++;
            } else if(c == 'b'){
                stack.push(c);
            }
        }
        return count;
    }
}
