//import javax.swing.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class SymmetricTree {


    //LEETCODE 101
    //CONCEPT
    //TAKE LEFT AND RIGHT NODE FORM ROOT 
    //ADD IT IN QUEUE
    //RUN WHILE(!QUEUE.ISEMPTY())
    //STORE THAT NODES AND REMOVE IT FROM QUEUE
    // -> TreeNode left=queue.poll()
    // ->TreeNode right=queue.poll()
    //CHECK THE CONDITIONS
    //IF CONDITIONS FAILS ADD IN THIS WAY
    //QUEUE.ADD(LEFT.LEFT) 
    //QUEUE.ADD(RIGHT.RIGHT)
    //QUEUE.ADD(LEFT.RIGHT)
    //QUEUE.ADD(RIGHT.LEFT)
    public boolean isSymmetric(TreeNode root) 
    {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty())
        {
            TreeNode left=queue.poll();
            TreeNode right=queue.poll();
            if(left==null && right==null)
            continue;
            if(left==null || right==null)
            return false;
            if(left.val!=right.val)
            return false;

            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);

        }
        
        return true;

    }

    
    
}
