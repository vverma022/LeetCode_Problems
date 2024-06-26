package BST;

import java.sql.Array;
import java.util.ArrayList;

import static BST.BinarySeacrhTreetoGreaterSearchTree.helper;

public class BalanceaBinaryTree {
     static class  TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
}

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        BalanceaBinaryTree obj = new BalanceaBinaryTree();
        TreeNode res = obj.balanceBST(root);
        System.out.println(res.val);

    }
     public static ArrayList<TreeNode> order = new ArrayList<>();
    public static TreeNode balanceBST(TreeNode root) {
        BalanceaBinaryTree.inorder(root);
        return helper(0,order.size()-1);

    }
    public static void inorder(TreeNode root){ //This function will store the inorder traversal of the tree in the order arraylist
        //The tree will become a sorted array ex: 1,2,3,4,5,6,7
        if (root == null){
            return;
        }
        inorder(root.left);
        order.add(root);
        inorder(root.right);
    }
    public static TreeNode helper(int start, int end){ //This function will create a balanced tree from the sorted array
        if (start > end){ //The start is the left index and end is the right index  of the arraylist
            return null;
        }
        int mid = (start + end)/2; //we get the middle index of the arraylist as to balance the tree the mid element should be the root
        TreeNode root = order.get(mid);
        root.left = helper(start,mid-1); //The left of the root will be the left subtree of the arraylist
        root.right = helper(mid + 1, end); //The right of the root will be the right subtree of the arraylist
        return root;
    }
}
