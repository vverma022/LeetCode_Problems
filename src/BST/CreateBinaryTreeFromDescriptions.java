package BST;

import java.util.HashMap;
import java.util.HashSet;

public class CreateBinaryTreeFromDescriptions {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {

    }
    public static TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int[] description : descriptions){
            int parent = description[0];
            int child = description[1];
            boolean left = description[2] == 1;

            if (!map.containsKey(parent)){
                map.put(parent,new TreeNode(parent));
            }
            if (!map.containsKey(child)){
                map.put(child,new TreeNode(child));
            }

            if (left){
                map.get(parent).left = map.get(child);
            } else {
               map.get(parent).right = map.get(child);
            }
            set.add(child);
        }
        for(int[] description : descriptions){
            int parent = description[0];
            if (!set.contains(parent)){
                return map.get(parent);
            }
        }
        return null;
    }
}
