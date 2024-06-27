package BST;
import java.util.HashMap;

public class FindCenterofStarGraph {
    void main(String[] args) {
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};
        FindCenterofStarGraph obj = new FindCenterofStarGraph();
        int res = obj.findCenter(edges);
        System.out.println(res);
    }

    private static int findCenter(int[][] edges) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];

            map.put(a, map.getOrDefault(a, 0) + 1);
            map.put(b, map.getOrDefault(b, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == edges.length) {
                return key;
            }
        }

            return -1;
        }
    private static int findCenter2(int[][] edges) {
        int[] first = edges[0];
        int[] second = edges[1];

        for(int i =0; i < edges.length;i++) {
            if (first[0] == second[0] || first[0] == second[1]) {
                return first[0];
            }
        }
            return first[1];
    }
    }


