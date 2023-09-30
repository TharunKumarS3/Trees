import javax.swing.tree.TreeNode;

public class CovertArrayToTree {
     public TreeNode sortedArrayToBST(int[] nums) {
        int s=0;
        int e=nums.length-1;
        return consTree(nums,s,e);
        
    }
    TreeNode consTree(int[] arr,int s,int e)
    {
        if(s>e)
        return null;

        int mid=(s+e)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=consTree(arr,s,mid-1);
        root.right=consTree(arr,mid+1,e);

        return root;
    }

}
