import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

//import javax.swing.tree.TreeNode;

public class RightView {

    //LEETCODE 199
    //PRINTING RIGHT MOST NODE OF EACH LEVEL
    //SAME CODE AS LEVEL ORDERpublic List<Integer> rightSideView(TreeNode root)
    {
        List<Integer> result=new ArrayList<>();
       if(root==null)
       return result;

      
       Queue<TreeNode> queue=new LinkedList<>();
       queue.offer(root);
       while(!queue.isEmpty())
       {
           int levelSize=queue.size();
          
           for(int i=0;i<levelSize;i++)
           {
                TreeNode current=queue.poll();

               //checking for rightmost node of the level
               if(i==levelSize-1)
               {
                   result.add(current.val);
               }
               if(current.left!=null)
               {
                   queue.offer(current.left);
               }
               if(current.right!=null)
               {
                   queue.offer(current.right);
               }
           }
           
       }
       return result;
   }


    
}
