package BitManipulation;

public class NumberofStepstoReduceaNumber {
    public static void main(String[] args) {
        String s = "1101";
        System.out.println(numSteps(s));
    }

    public static int numSteps(String s) {
        char[] sarr = s.toCharArray();
        int n = sarr.length;
        int carry = 0;
        int count = 0;
        for(int i = n - 1; i > 0; i--){
            if(sarr[i] - '0' + carry == 1){
                carry = 1;
                count += 2;
        } else {
            count++;
        }
    }
    return count + carry;
    }
}
