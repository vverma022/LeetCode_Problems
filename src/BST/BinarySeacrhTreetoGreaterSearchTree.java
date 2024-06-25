package BST;

import javax.swing.tree.TreeNode;

public class BinarySeacrhTreetoGreaterSearchTree {
    public static void main(String[] args) {

    }
    public static TreeNode bstToGst(TreeNode root) {
        int[] sum = new int[1]; //we use array to store the sum because we want to store the sum of the nodes
        helper(root,sum);
        return root;

    }
    public static void helper(TreeNode root, int[] sum){
        if(root == null){
            return;
        }

        helper(root.right,sum); //we will go to the right side of the tree
                            //here we are going to the right side of the tree because we want to get the sum of the right side of the tree
        sum[0] += root.val; //we will add the value of the root to the sum
        root.val = sum[0]; //we will update the value of the root

        helper(root.left,sum); //after we traverse the whole right and valus are added we will go to the left side of the tree

    }
}
