package Stack;

import java.util.Stack;

public class ReverseSubStringsBetweenEachPairofParentheses {
    public static void main(String[] args) {
        String s = "(abcd)";
        System.out.println(reverseParentheses(s));
    }
    public String reverseParentheses(String s) {
        Stack<Integer> stack  = new Stack<>();
        StringBuilder sb = new StingBuilder();

        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(sb.length());
            } else if (c == ')'){
                int start = stack.pop();
                reverse(sb,start,sb.length()-1);
            } else {
                sb.append(c);
            }
        }
       return sb.toString();
    }
    public static void reverse(StringBuilder sb, int start,int end){
        while(start < end){
            char temp = sb.charAt(start);
            sb.setCharAt(start++,sb.charAt(end));
            sb.setCharAt(end--,temp);

        }
    }
}
