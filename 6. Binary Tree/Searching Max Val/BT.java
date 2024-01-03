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

    int search(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int result = root.data;
        int left = search(root.left);
        int right = search(root.right);

        if (left > result)
            result = left;
        if (right > result)
            result = right;
        return result;
    }

    public static void main(String[] args) {
        BT bt = new BT();
        bt.creation();
        System.out.println(bt.search(bt.root));
    }
}
