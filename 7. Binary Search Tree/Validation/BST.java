public class BST {

    private TreeNode root;

    private static class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    void insert(int val) {
        root = insertion(root, val);
    }

    TreeNode insertion(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.data) {
            root.left = insertion(root.left, val);
        } else if (val > root.data){
            root.right = insertion(root.right, val);
        }
        return root;
    }

    public void recursive_Inorder(TreeNode root) {
        if (root == null)
            return;

        recursive_Inorder(root.left);
        System.out.println(root.data);
        recursive_Inorder(root.right);
    }

    boolean isValid(TreeNode root, long min,long max)
    {
        if(root==null)
        return true;

        if(root.data<=min || root.data>=max)
        return false;

        boolean left=isValid(root.left, min, root.data);
        if (left) {
            boolean right=isValid(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(2);
        bst.insert(1);
        bst.insert(7);
        bst.insert(6);

        bst.recursive_Inorder(bst.root);
        System.out.println(bst.isValid(bst.root, Integer.MIN_VALUE,Integer.MAX_VALUE ));
    }
}
