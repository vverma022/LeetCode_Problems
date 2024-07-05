package LinkedList;

public class FindMinimumandMaximumNumberofNodesBetweenCriticalPoints {
    public static void main(String[] args) {

    }
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
          int currentpos = 1;
          int precriticalpos = 0;
          int criticalpos = 0;
          ListNode current = head.next;
          ListNode pre = head;
          int minDistance = Integer.MAX_VALUE;
          while(current != null){
              if((pre.val < current.val && current.next.val < current.val) || (pre.val > current.val && current.val < current.next.val)){
                  if(precriticalpos == 0){
                      precriticalpos = currentpos;
                      criticalpos = currentpos;
                  } else {
                      minDistance = Math.min(minDistance, currentpos - precriticalpos);

                  }
              }
              currentpos++;
              pre = current;
              current = current.next;
          }
          if (minDistance == Integer.MAX_VALUE) {
              return new int[]{-1, -1};
          }
          int maxDistance = precriticalpos - criticalpos;
            return new int[]{minDistance, maxDistance};

    }
}
