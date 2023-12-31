class DiamaterOfBinaryTree {
    // public int diameterOfBinaryTree(TreeNode root) {
    //     int[] d=new int[1];
    //     helper(root,d);
    //     return d[0];
    // }
    // static int helper(TreeNode node,int[] max)
    // {
    //     if(node==null)
    //     return 0;
    //     int l=helper(node.left,max);
    //     int r=helper(node.right,max);
    //     max[0]=Math.max(max[0],l+r);
    //     return 1+Math.max(l,r);
    // }

    public static int diameter=0;
    public int diameterTree(TreeNode node)
    {

        height(node);
        return diameter-1;
    }
    static int height(TreeNode node)
    {
        if(node==null)
        return 0;
        int left=height(node.left);
        int right=height(node.right);
        int dia=left+right+1;
        diameter=Math.max(diameter,dia);
        return Math.max(left,right)+1;

    } 
}