import java.util.List;

public class BinaryTreePath {

    List<String> ans=new ArrayList<>();
     public List<String> binaryTreePaths(TreeNode root) {

        helper(root,"");
        return ans;
    }
    public void helper(TreeNode node,String s)
    {
        if(node==null)
        return ;

        s+=node.val+"->";

        helper(node.left,s);
        helper(node.right, s);
        if(node.left==null && node.right==null )
        ans.add(s.substring(0, s.length()-2));

        return ;
    }

    
}
