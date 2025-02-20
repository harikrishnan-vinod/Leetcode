package Easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) 
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
    

public class AverageOfLevelsBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) 
    {
        List<Double> averages = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            long sum = 0l;
            for (int i = 0; i < levelSize;++i)
            {
                TreeNode temp = queue.poll();
                sum+= temp.val;
                if(temp.left != null)
                {
                    queue.offer(temp.left);
                }
                if(temp.right != null)
                {
                    queue.offer(temp.right);
                }
            }
            averages.add(sum/(double)levelSize);
        }
        return averages;
    }
}
