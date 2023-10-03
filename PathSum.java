public class PathSum {

    //LEETCODE 112 PATHSUM

    boolean hasPathSum(TreeNode root,int sum)
    {
        if(root==null)
        return false;


        //sum sould be equal and its left and right should be null
        if(root.val==sum && root.left==null && root.right==null)
        {
            //ans found
            return true;
        }

        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
    
}
