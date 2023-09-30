public class MaxDepthOfTree {

    //LEETCODE 104 DEPTH OF THE TREE

    public int maxDepth(TreeNode node)
    {
        if(node==null)
        return 0;

        //go left and right //depth => postorder
        int left=maxDepth(node.left);
        int right=maxDepth(node.right);
        int depth=Math.max(left,right)+1;//same as diameter of the tree

        return depth;
    }
    
}
