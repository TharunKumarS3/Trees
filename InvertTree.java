public class InvertTree {

    //LEETCODE 226 INVERT BINARY TREE

    public TreeNode invertTree(TreeNode node)
    {
        if(node==null)
        return null;

        //go till last node of left and right and return that node
        TreeNode left=invertTree(node.left);
        TreeNode right=invertTree(node.right);

        ////after returning left and right 
        //we just need to swap

        node.left=right;
        node.right=left;

        //
        return node;
    }
    
}
