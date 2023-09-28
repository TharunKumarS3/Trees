import java.util.LinkedList;
import java.util.Queue;

public class SuccessorOfNode {

    //no need for loop for this program
    public static TreeNode successor(TreeNode root,int key)
    {
        if(root==null)
        {
            return null;
        }
    Queue<Integer> queue=new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty())
    {
        TreeNode node=queue.poll();
        if(node.left!=null)
        {
            queue.offer(node.left);
        }
        if(node.right!=null)
        {
            queue.offer(node.right);
        }
        if(node.val==key)
        {
            break;
        }
    }
    return queue.peek();




    }    
}
