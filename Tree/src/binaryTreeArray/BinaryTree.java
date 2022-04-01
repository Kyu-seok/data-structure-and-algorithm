package binaryTreeArray;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank Tree of size " + size + " has been created");
    }

    boolean isFull() {
        if (arr.length - 1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }
    }

    // insert method
    void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("The value of " + value + " has been inserted");
        } else {
            System.out.println("The BT is full");
        }
    }

    public void preOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        System.out.println(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    public void inOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2);
        System.out.println(arr[index] + " ");
        inOrder(index * 2 + 1);
    }

    public void postOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.println(arr[index] + " ");
    }

    public void levelOrder() {
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}
