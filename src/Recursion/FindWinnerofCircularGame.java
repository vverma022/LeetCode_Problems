package Recursion;

public class FindWinnerofCircularGame {
    public static void main(String[] args) {
     int n = 5;
        int k = 2;
            System.out.println(findTheWinner(n,k));
    }
    public static int findTheWinner(int n, int k) {
        int result = helper(n,k);

        return result + 1;
    }

    public static int helper(int n,int k){
        if(n == 1){
            return 0;
        }

        int index = helper(n-1,k);
        index = (index + k) % n;

        return index;
    }
}
