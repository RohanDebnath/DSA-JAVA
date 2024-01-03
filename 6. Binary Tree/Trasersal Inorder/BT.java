import java.util.*;
public class BT {

    private TreeNode root;
    private static class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data)
        {
            this.data=data;
        }
    }
    public void creation()
    {
        TreeNode first=new TreeNode(10);
        TreeNode second=new TreeNode(20);
        TreeNode third=new TreeNode(30);
        TreeNode fourth=new TreeNode(40);
        TreeNode fifth=new TreeNode(50);

        root=first;
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
    }
    public void recursive_Inorder(TreeNode root)
    {
        if(root==null)
        return;

        recursive_Inorder(root.left);
        System.out.println(root.data);
        recursive_Inorder(root.right);
    }

    public void iterative_InOrder()
    {
        if(root==null)
        return;
        Stack<TreeNode> stack= new Stack<>();
        TreeNode temp=root;
        while (!stack.isEmpty() || temp!=null) {
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }else{
                temp=stack.pop();
                System.out.println(temp.data);
                temp=temp.right;
            }
        }
    }
    public int height(TreeNode root)
    {
        if(root==null)
        return 0;
        else{
            return Math.max(height(root.left), height(root.right))+1;
        }
    }
    public static void main(String[] args) {
        BT bt= new BT();
        bt.creation();
        bt.recursive_Inorder(bt.root);
        System.out.println();
        bt.iterative_InOrder();
    }
}
