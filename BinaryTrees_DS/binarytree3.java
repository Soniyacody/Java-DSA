import java.util.ArrayList;

public class binarytree3 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void k_level(Node root, int k, int level) {
        if (root == null) {
            return;
        }
        if (k == level) {
            System.out.print(root.data + " ");
        }
        k_level(root.left, k, level + 1);
        k_level(root.right, k, level + 1);
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundleft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);
        if (foundleft || foundright) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node LCA(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        // last common ancestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // LAst equal node -> i-1th
        Node lca = path1.get(i - 1);
        return lca;
    }

    public static Node LCA2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = LCA2(root.left, n1, n2);
        Node rightLCA = LCA2(root.right, n1, n2);
        // Left LCA ->return valid ,right->null
        if (rightLCA == null) {
            return leftLCA;
        }
        // right LCA ->return valid ,left->null
        if (leftLCA == null) {
            return rightLCA;
        }
        // Both left n right r valid
        return root;
    }

    public static int lca_Distance(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDistance = lca_Distance(root.left, n);
        int rightDistance = lca_Distance(root.right, n);
        if (leftDistance == -1 && rightDistance == -1) {
            return -1;
        } else if (leftDistance == -1) {
            return rightDistance + 1;
        } else {
            return leftDistance + 1;
        }
    }

    public static int minDistance(Node root, int n1, int n2) {
        Node lca = LCA2(root, n1, n2);
        int dist1 = lca_Distance(lca, n1);
        int dist2 = lca_Distance(lca, n2);
        return dist1 + dist2;
    }

    public static int Kth_Ancestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDistance = Kth_Ancestor(root.left, n, k);
        int rightDistance = Kth_Ancestor(root.right, n, k);
        if (leftDistance == -1 && rightDistance == -1) {
            return -1;
        }
        int max = Math.max(leftDistance, rightDistance);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);
        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.left == null ? 0 : root.right.data;
        root.data = newLeft + newRight + leftChild + rightChild;
        return data;
    }

    public static void Print_Prorder_Tree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Print_Prorder_Tree(root.left);
        Print_Prorder_Tree(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7
        // k_level(root, 2, 1);
        // System.out.println(LCA(root, 6, 5).data);
        // System.out.println(LCA2(root, 6, 5).data);
        // System.out.println(minDistance(root, 4, 7));
        // Kth_Ancestor(root, 5, 1);
        transform(root);
        Print_Prorder_Tree(root);
    }
}
