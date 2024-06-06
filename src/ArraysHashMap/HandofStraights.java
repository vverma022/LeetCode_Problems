package ArraysHashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class HandofStraights {
    public static void main(String[] args) {
        int[] hand =  {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;


    }

    public static boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n % groupSize != 0) return false; //if the length of the array is not divisible by the group size we can't form the groups
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for (int j : hand) { //putting the frequency of each element in the map
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        while (!map.isEmpty()){
            int first = map.firstKey(); //getting the first key
            for(int i = first; i< groupSize;i++){ //checking if we can form the group
               if (!map.containsKey(first+i)) return false; //if map doesn't contain the key we can't form the group

               map.put(first+i, map.get(first+i) - 1); //decreasing the frequency of the key
               if (map.get(first+i) == 0) map.remove(first+i); //if it becomes 0 we remove it from the map
            }
        }
        return true;


    }
}