package Easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinimumAbsoluteDifferenceInBST 
{
    public int getMinimumDifference(TreeNode root) 
    {
        Deque<TreeNode> stack = new ArrayDeque<>();
        int result = Integer.MAX_VALUE;
        int prev = -1;
        while(root != null||!stack.isEmpty())
        {
            while(root != null)
            {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if(prev >= 0)
            {
                result = Math.min(result, root.val - prev);

            }
            prev = root.val;
            root = root.right;
        }

        return result;
    }
}
