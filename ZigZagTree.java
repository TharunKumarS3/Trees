import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class ZigZagTree {

    //LEETCODE 103.BINARY TREE ZIGZAG
    //CONCEPT
    //2 ORDERS
    //DECLARE BOOLEAN REVERSE=FALSE;
    //NORMAL AND REVERSE
    //NORMAL -> REMOVE FIRST AND ADD LAST IN DEQUEUE
    //REVERSE -> REMOVE LAST AND ADD FIRST IN DEQUEUE AND ADD 1ST NODE.RIGHT THEN NODE.LEFT
    //SWITCH REVERSE = !REVERSE

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Deque<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    boolean reverse = false;
    
    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      List<Integer> currentLevel = new ArrayList<>(levelSize);
      for (int i=0; i < levelSize; i++) {
        if (!reverse) {
          TreeNode currentNode = queue.pollFirst();
          currentLevel.add(currentNode.val);
          if (currentNode.left != null) {
            queue.addLast(currentNode.left);
          }
          if (currentNode.right != null) {
            queue.addLast(currentNode.right);
          }
        } else {
          TreeNode currentNode = queue.pollLast();
          currentLevel.add(currentNode.val);
          if (currentNode.right != null) {
            queue.addFirst(currentNode.right);
          }
          if (currentNode.left != null) {
            queue.addFirst(currentNode.left);
          }
        }
      }
      reverse = !reverse;
      result.add(currentLevel);
    }
    return result;
  }

    
}
