import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class AvgOfLevelTree {


    
//LEETCODE 637. Avg level in binary tree
//same code like 102.levelorder
    
static List<Double>  averageOfLevels(TreeNode root)
{
    List<Double> result=new ArrayList<>();
     if(root==null)
    {
        return result;
    } 
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty())
    {
        
        int levelSize=queue.size();
        double sum=0;
        for(int i=0;i<levelSize;i++)
        {
            TreeNode node=queue.poll();
            sum+=node.val;
            if(node.left!=null)
            {
                queue.offer(node.left);
            }
            if(node.right!=null)
            {
                queue.offer(node.right);
            }
            
        }
        result.add(sum/levelSize);
        
    }
    return result;
   
}

    
}
