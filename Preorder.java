import java.util.ArrayList;
import java.util.List;

public class Preorder {
     public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;
        
    }
    void helper(TreeNode node,List<Integer> ans)
    {
        if(node==null)
        return ;

        ans.add(node.val);
        helper(node.left,ans);
        helper(node.right,ans);

    }
    
    
}
