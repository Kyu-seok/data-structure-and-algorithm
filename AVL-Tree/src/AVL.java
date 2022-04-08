import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    BinaryNode root;

    AVL() {
        root = null;
    }

    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value: " + value + " not found in AVL");
            return null;
        } else if (node.value == value) {
            System.out.println("Value: " + value + " found in AVL");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public int getHeight(BinaryNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private BinaryNode rotateRight(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    private BinaryNode rotateLeft(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    public int getBalance(BinaryNode node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    private BinaryNode insertNode(BinaryNode node, int nodeValue) {
        if (node == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        } else if (nodeValue < node.value) {
            node.left = insertNode(node.left, nodeValue);
        } else {
            node.right = insertNode(node.right, nodeValue);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);

        if (balance > 1 && nodeValue < node.left.value) {
            return rotateRight(node);
        }

        if (balance > 1 && nodeValue > node.left.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && nodeValue > node.right.value) {
            return rotateLeft(node);
        }

        if (balance < -1 && nodeValue < node.right.value) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

    public static BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) {
            return root;
        }
        return minimumNode(root.left);
    }

    public BinaryNode deleteNode(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value not found in AVL");
            return node;
        }
        if (value < node.value) {
            node.left = deleteNode(node.left, value);
        } else if (value > node.value) {
            node.right = deleteNode(node.right, value);
        } else {
            if (node.left != null && node.right != null) {
                BinaryNode temp = node;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                node.value = minNodeForRight.value;
                node.right = deleteNode(node.right, minNodeForRight.value);
            } else if (node.left != null) {
                node = node.left;
            } else if (node.right != null) {
                node = node.right;
            } else {
                node = null;
            }
        }
        int balance = getBalance(node);
        if (balance > 1 && getBalance(node.left) >= 0) {
            return rotateRight(node);
        }
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balance < -1 && getBalance(node.right) <= 0) {
            return rotateLeft(node);
        }
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }

    public void delete(int value) {
        root = deleteNode(root, value);
    }

    public void deleteAVL() {
        root = null;
        System.out.println("AVL has been successfully deleted");
    }

}
