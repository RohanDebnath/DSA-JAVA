import java.util.Stack;

public class BT {

    private TreeNode root;

    private static class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void creation() {
        TreeNode first = new TreeNode(10);
        TreeNode second = new TreeNode(20);
        TreeNode third = new TreeNode(30);
        TreeNode fourth = new TreeNode(40);
        TreeNode fifth = new TreeNode(50);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    public int height(TreeNode root) {
        if (root == null)
            return 0;
        else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

    void recursive_PostOrder(TreeNode root) {
        if (root == null)
            return;

        recursive_PostOrder(root.left);
        recursive_PostOrder(root.right);
        System.out.println(root.data);

    }

    void iterative_PostOrder() {
        TreeNode currentNode = root;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.data);
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.println(temp.data);
                    }
                } else {
                    currentNode = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        BT bt = new BT();
        bt.creation();
        bt.recursive_PostOrder(bt.root);
        System.out.println(bt.height(bt.root));
        System.out.println();
        bt.iterative_PostOrder();
    }
}
