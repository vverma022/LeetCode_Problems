package ArraysHashMap;

public class AverageWatingTime {
    public static void main(String[] args) {
        int[][] customers = {{1,2},{2,5},{4,3}};
        System.out.println(averageWaitingTime(customers));

    }
    public static double averageWaitingTime(int[][] customers) {
        int currenttime = 0;
        double totalwaittime = 0;
        int n = customers.length;

        for(int[] customer : customers){
            int arrival = customer[0];
            int cooktime = customer[1];
            if(currenttime < arrival){
                currenttime = arrival;
            }
            int waittime = currenttime + cooktime - arrival;
            totalwaittime += waittime;
            currenttime += cooktime;

        }
        return totalwaittime/n;

    }
}
