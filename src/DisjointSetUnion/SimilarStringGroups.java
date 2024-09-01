package DisjointSetUnion;

import java.util.Arrays;

public class SimilarStringGroups {
    static int[] Parent;
    static int[] Rank;
    public static void main(String[] args) {
        String[] strs = {"tars","rats","arts","star"};
        System.out.println(numSimilarGroups(strs));

    }
    public static int find(int i){
        if(i == Parent[i]){
            return i;
        }

        return Parent[i] = find(Parent[i]);
    }

    public static void Union(int i,int j){
        int parent_x = find(i);
        int parent_y = find(j);

        if(parent_x == parent_y){
            return;
        }

        if(Rank[parent_x] > Rank[parent_y]){
            Parent[parent_y] = parent_x;
        } else if(Rank[parent_y] > Rank[parent_x]){
            Parent[parent_x] = parent_y;
        } else {
            Parent[parent_y] = parent_x;
            Rank[parent_x]++;
        }
    }

    public  static boolean isSimilar(String a, String b){
        int diff = 0;
        int n = a.length();

        for(int i = 0; i < n; i++){
            if(a.charAt(i) != b.charAt(i)){
                diff++;
            }
        }

        return diff == 2 || diff == 0;

    }
    public static int numSimilarGroups(String[] strs) {
        int n = strs.length;
        Parent = new int[n];
        Rank = new int[n];
        Arrays.fill(Rank,0);

        int ans = n;

        for(int i = 0; i < n;i++){
            Parent[i] = i;
        }

        for(int k = 0; k < n; k++){
            for(int l = k+1; l < n; l++){
                if(isSimilar(strs[k],strs[l]) && find(l) != find(k)){
                    ans--;
                    Union(k,l);
                }
            }
        }
        return ans;

    }
}
