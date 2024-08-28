package ArraysHashMap;

public class CountSubIslands {
    public static void main(String[] args) {
        int[][] grid1 = {{1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}};
        int[][] grid2 = {{1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,0,1,1},{0,1,0,1,0}};
        System.out.println(countSubIslands(grid1,grid2));

    }

    public static int countSubIslands(int[][] grid1, int[][] grid2){
        int count = 0;
        int m = grid2.length;
        int n = grid2[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid2[i][j] == 1 && checkSubIslands(grid1,grid2,i,j)){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean checkSubIslands(int[][] grid1, int[][] grid2, int i, int j){
        if(i < 0 || i > grid1.length || j < 0 || j > grid1[0].length || grid2[i][j] == 0){
            return true;
        }

        grid2[i][j] = -1;

        boolean result = (grid1[i][j] == 1);

        result = result & checkSubIslands(grid1,grid2,i+1,j);
        result = result & checkSubIslands(grid1,grid2,i-1,j);
        result = result & checkSubIslands(grid1,grid2,i,j+1);
        result = result & checkSubIslands(grid1,grid2,i,j-1);

        return  result;
    }
}
