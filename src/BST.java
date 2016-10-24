/**
 * Created by brainbreaker on 23/10/16.
 */
public class BST {
    class Node {
        int data;
        Node left;
        Node right;
    }
    public boolean checkBST(Node root){
        if (root == null){
            return true;
        }

        if (isSubtreeLesser(root.left, root.data) && isSubtreeGreater(root.right, root.data)
                && checkBST(root.left) && checkBST(root.right)){
            return true;
        }
        else
            return false;
    }

    private boolean isSubtreeGreater(Node root, int data) {
        if (root == null){
            return true;
        }
        return root.data > data && isSubtreeGreater(root.right, data) && isSubtreeGreater(root.left, data);
    }

    private boolean isSubtreeLesser(Node root, int data) {
        if (root == null){
            return true;
        }
        return root.data < data && isSubtreeGreater(root.right, data) && isSubtreeGreater(root.left, data);
    }
}
