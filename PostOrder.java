import java.util.ArrayList;
import java.util.List;

public class PostOrder {




     public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;
        
    }
     void helper(TreeNode node,List<Integer> ans)
    {
        if(node==null)
        return ;

        
        helper(node.left,ans);
        helper(node.right,ans);
        ans.add(node.val);

    }
    
}
