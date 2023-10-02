public class LowestCommonAnscestor {

    //LEETCODE 236 

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q)
    {
        //base condition
        if(root==null)
        {
            return null;
        }

        //check if we got any one of the node P or Q
        if(root==p ||root ==q)
        {
            //then return that node above call
            return root;
        }
        //if not found traverse left and right
        TreeNode left=lowestCommonAncestor(root.left, p, q);
        TreeNode right=lowestCommonAncestor(root.right, p, q);

        //if the we got both the nodes
        if(left!=null && right!=null)
        {
            //return root
            return root;
        }
        //else if both node are in same branch left or right
        //then we got only one node either left or right 
        //other node will be null
        //eg : if we got left node and right as null then return left vice versa
        //the concept is one node should be in left tree and other in right tree

        return left==null ? right:left;

    }
    
}
