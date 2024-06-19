package BinarySearch;

public class MinimumNumberofDaystomakembouquets {
    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        System.out.println(minDays(bloomDay, m, k));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            min = Math.min(min, bloomDay[i]);
             max = Math.max(max, bloomDay[i]);
        }
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (possible(bloomDay, m, k, mid)) {
                max = mid;
            } else {
                min = mid + 1;

            }
        }
        return min;
    }

    public static boolean possible(int[] bloomDay, int m, int k, int mid){
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] <= mid){
                bouquets++;
                if(bouquets == k){
                    m--;
                    bouquets = 0;
            }
            } else {
                bouquets = 0;
        }
        if(m == 0){
            return true;
        }
    }
    return false;

    }
}
