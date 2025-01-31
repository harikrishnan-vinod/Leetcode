import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

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


public class KthSmallestElementInBst 
{
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        while(root != null)
        {
            stack.push(root);
            root = root.left;
        }

        for(int i = 0; i < k - 1;++i)
        {
            root = stack.pop();
            root = root.right;
            while(root != null)
            {
                stack.push(root);
                root = root.left;
            }
        }

        return stack.peek().val;
    }

    public int kthSmallest2(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        while(root != null || !stack.isEmpty())
        {
            while(root != null)
            {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }

        Collections.sort(list);

        return list.get(k - 1);
}
}
