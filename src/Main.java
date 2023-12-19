public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Main main = new Main();
        System.out.println("In-Order Traversal");
        main.inOrderTraversal(root);

        System.out.println("Pre-Order Traversal");
        main.preOrderTraversal(root);

        System.out.println("Post-Order Traversal");
        main.postOrderTraversal(root);
    }

    public void inOrderTraversal(TreeNode root){
        if (root != null){
            inOrderTraversal(root.left);
            System.out.println(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(TreeNode root){
        if (root != null){
            System.out.println(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(TreeNode root){
        if (root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.data + " ");
        }
    }
}