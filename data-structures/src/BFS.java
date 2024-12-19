import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void bfs(TreeNode root){
        if(root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.data + " ");

            if(node.leftChild != null){
                queue.offer(node.leftChild);
            }

            if(node.rightChild != null){
                queue.offer(node.rightChild);
            }
        }
    }
}
