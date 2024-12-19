public class DFS {

    public void inOrderTraversal(TreeNode root) {
        if (root == null) return;

        // Left - Root - Right
        inOrderTraversal(root.leftChild);
        System.out.print(root.data + " ");
        inOrderTraversal(root.rightChild);
    }

    public void preOrderTraversal(TreeNode root) {
        if (root == null) return;

        // Root - Left - Right
        System.out.print(root.data + " ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    public void postOrderTraversal(TreeNode root) {
        if (root == null) return;

        // Left - Right - Root
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.data + " ");
    }
}
