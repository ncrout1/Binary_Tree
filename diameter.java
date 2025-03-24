class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTree {
    private int diameter = 0;

    // Function to calculate the diameter of the binary tree
    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);
        return diameter;
    }

    // Helper function to calculate the height of the tree
    private int calculateHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        // Update diameter at each node
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return height of the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Find and print the diameter of the binary tree
        System.out.println("Diameter of the binary tree: " + tree.diameterOfBinaryTree(root));
    }
}
