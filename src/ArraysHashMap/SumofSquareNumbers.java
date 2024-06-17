package ArraysHashMap;

public class SumofSquareNumbers {
    public static void main(String[] args) {
        int c = 5;
        System.out.println(judgeSquareSum(c));

    }
    public static boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int)Math.sqrt(c);
        while(i <= j){
            int sum = i * i + j * j;
            if(sum == c){
                return true;
            }else if(sum < c){
                i++;
            }else{
                j--;
            }
        }
        return false;

    }
}
