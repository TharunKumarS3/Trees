import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BottomUpOrder {

        //SAME CODE AS LEVEL ORDER ONLY ONE CHANGES 
        //WHEN ADDING LEVEL ELEMENTS IN BIG LIST WE HAVE TO ADD IT IN 0TH INDEX EVERYTIME
        //LEETCODE 107. Binary Tree Level Order Traversal II


        public List<List<Integer>> levelOrderBottom(TreeNode root) {
   List<List<Integer>> result=new ArrayList<>();
     if(root==null)
    {
        return result;
    } 
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty())
    {
        
        int levelSize=queue.size();
        List<Integer> currentLevel=new ArrayList<>(levelSize);
        for(int i=0;i<levelSize;i++)
        {
            TreeNode node=queue.poll();
            currentLevel.add(node.val);
            if(node.left!=null)
            {
                queue.offer(node.left);
            }
            if(node.right!=null)
            {
                queue.offer(node.right);
            }
            
        }
        result.add(0,currentLevel); //ONLY CHANGED HERE //SAME AS LEVELORDER.java
        
    }
    return result;
    }

    
}
