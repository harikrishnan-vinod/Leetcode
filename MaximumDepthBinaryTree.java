import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayDeque;
import java.util.Deque;

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

public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) 
    {
        if(root == null)
        {
            return 0;
        }

        else return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int maxDepth2(TreeNode root)
    {
        Deque<SimpleEntry<TreeNode, Integer>> stack = new ArrayDeque<>();
        int res = 0;

        stack.push(new SimpleEntry<>(root, 1));

        while (!stack.isEmpty())
        {
            SimpleEntry<TreeNode, Integer> current = stack.pop();
            TreeNode node = current.getKey();
            int value = current.getValue();

            if(node != null)
            {
                res =Math.max(res, value);
                stack.push(new SimpleEntry<>(node.left, value + 1));
                stack.push(new SimpleEntry<>(node.right, value + 1));
            }
        }

        return res;
    }
}
