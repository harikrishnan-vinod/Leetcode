package Medium;

import java.util.HashMap;
import java.util.Map;

class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ConstructBinaryTreeFromInorderAndPreorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        TreeNode head = new TreeNode(inorder[0]);

        Map<Integer,Integer> map = new HashMap<>();
        
       for(int i = 0; i < inorder.length; ++i)
       {
            map.put(inorder[i], i);
       }

       return helper(preorder, inorder, 0 ,0, inorder.length - 1, map);
       
    }

    public TreeNode helper(int[] preorder, int[] inorder,int rootIndex, int start, int end, Map<Integer, Integer> map)
    {
        TreeNode root = new TreeNode(preorder[rootIndex]);
        int mid = map.get(preorder[rootIndex]);
        if(mid > start)
        {
            root.left = helper(preorder, inorder, rootIndex + 1 , start, mid - 1, map);
        }

        if(mid < end)
        {
            root.right = helper(preorder, inorder, rootIndex + mid - start + 1, mid + 1, end, map);
        }

        return root;
    }


    public static void main(String[] args)
    {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        ConstructBinaryTreeFromInorderAndPreorder obj = new ConstructBinaryTreeFromInorderAndPreorder();

        obj.buildTree(preorder, inorder);
    }
}
