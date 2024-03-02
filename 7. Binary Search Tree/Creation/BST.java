import java.util.Scanner;

public class BST {

    private TreeNode root;
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data)
        {
            this.data=data;
        }
    }
    public void insert(int val)
    {
        root=insertion(root, val);
    }
    TreeNode insertion(TreeNode root, int val)
    {
        if(root==null)
        {
            root= new TreeNode(val);
            return root;
        }
        if(val<root.data)
        root.left=insertion(root.left, val);
        else if(val>root.data)
        root.right=insertion(root.right, val);

        return root;
    }
    public void recursive_Inorder(TreeNode root)
    {
        if(root==null)
        return;

        recursive_Inorder(root.left);
        System.out.println(root.data);
        recursive_Inorder(root.right);
    }
    public static void main(String[] args) {
        BST bst= new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        // boolean decision=true;
        // while (decision) {
        //     Scanner sc= new Scanner(System.in);
        //     System.out.println("Press Y/N");
        //     char choice=sc.nextLine().charAt(0);
        //     if(choice=='y'||choice=='Y')
        //     {
        //         System.out.println("Please enter your value");
        //         int val=sc.nextInt();
        //         bst.insert(val);
        //     }else if(choice=='n'||choice=='N')
        //     {
        //         break;
        //     }
        // }
        bst.recursive_Inorder(bst.root);
    }
}
