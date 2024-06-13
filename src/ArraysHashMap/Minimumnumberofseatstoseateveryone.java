package ArraysHashMap;

import java.util.Arrays;

public class Minimumnumberofseatstoseateveryone {
    public static void main(String[] args) {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        System.out.println(minMovesToSeat1(seats,students));

    }
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count = 0;

        for(int i = 0; i < seats.length; i++){
            count += Math.abs(seats[i] - students[i]);
        }
        return count;
     //Time complexity : O(nlogn)
    }
    public static int minMovesToSeat1(int[] seats, int[] students) {
        int[] seatPos = new int [101] ;
        int[] studentPos = new int [101] ;

        for (int i = 0; i < seats.length; i++) {
            seatPos[seats[i]]++ ;
            studentPos[students[i]]++ ;
        }

        int x = 0, y = 0, result = 0 ;

        while (x < seatPos.length && y < studentPos.length) {
            while (seatPos[x] == 0) {
                x++ ;
                if (x == seatPos.length) {
                    return result ;
                }
            }

            while (studentPos[y] == 0) {
                y++ ;
                if (y == studentPos.length) {
                    return result ;
                }
            }

            if (x >= y) {
                result += x - y ;
            }
            else {
                result += y - x ;
            }

            seatPos[x]-- ;
            studentPos[y]-- ;
        }

        return result ;
    }
}
