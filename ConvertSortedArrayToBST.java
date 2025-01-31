import java.util.Arrays;

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

public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        if(nums.length == 0)
        {
            return null;
        }
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        int[] numsLeft = Arrays.copyOfRange(nums,0,nums.length/2);
        root.left = sortedArrayToBST(numsLeft);
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums,nums.length/2 + 1,nums.length));
        return root;
    }
}
