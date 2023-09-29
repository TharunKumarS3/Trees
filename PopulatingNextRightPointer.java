public class PopulatingNextRightPointer {
    //LEETCODE 116
    //WE ARE NOT USING QUEUE INSTEAD WE USED LINKEDLIST CONCEPT
    //JUST CONNECTING WORKS THAT'S IT

    public Node connect(Node root) {
        if(root ==null)
        return null;

        Node leftmost=root;
        while(leftmost.left!=null)
        {
            Node current=leftmost;
            while(current!=null)
            {
                current.left.next=current.right;
                if(current.next!=null)
                {
                    current.right.next=current.next.left;
                }
                current=current.next;

            }
            leftmost=leftmost.left;
        }
        return root;
    }
    
}
