
public class binarytree_prc {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean unival_helper(TreeNode root, int a) {
        if (root == null) {
            return true;
        }
        if (root.data != a) {
            return false;
        }
        return unival_helper(root.left, a) && unival_helper(root.right, a);
    }

    public static boolean unival(TreeNode root) {
        if (root == null) {
            return true;
        }
        System.out.print(root.data + "// ");
        boolean left = unival(root.left);
        boolean right = unival(root.right);
        return (left && right && unival_helper(root.left, root.data) && unival_helper(root.right, root.data));
    }

    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }

        removeLeafNodes(root.left, target);
        removeLeafNodes(root.right, target);
        if (root.left == null && root.right == null && root.data == target) {
            System.out.print("->" + root.data);
            return null;
        }
        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String args[]) {
        // 1
        // /\
        // 2 3
        // /\ /\
        // 42 25
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(5);
        // System.out.println(" Univalued : " + unival(root));
        printTree(root);
        // System.out.println("\n" + removeLeafNodes(root, 2).data + "\n");
    }
}
