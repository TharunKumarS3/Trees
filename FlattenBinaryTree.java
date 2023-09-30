public class FlattenBinaryTree {

    //LEETCODE 11 FLATTEN BINARY TREE

    public void flatten(TreeNode node)
    {
        TreeNode current=node; //storing root to current
        while(current!=null)
        {
            //check if it has left
            if(current.left!=null)
            {
                //go to the left of current node and save in temp
                TreeNode temp=current.left;
                //find the rigtmost node of that branch
                while(temp.right!=null)
                {
                    temp=temp.right;
                }
                //after finding the rightmost node
                //put the current node's right branch to temp's right
                temp.right=current.right;
                //now put cuurent node's left to right
                current.right=current.left;
                //now make current node's left to null
                current.left=null;

            }
            //after one changes move to next node to do same changes
            //we are moing to right only bcoz we made current node's left to null
            current=current.right;
        }


    }
    
    
}
