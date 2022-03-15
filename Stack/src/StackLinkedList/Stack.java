package StackLinkedList;

public class Stack {
    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    public void push(int value) {
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in Stack");
    }

    public boolean isEmpty() {
        return linkedList.head == null ? true : false;
    }

    public int pop() {
        int result = - 1;
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
        } else {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }

    public int peek() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
        } else {
            value = linkedList.head.value;
        }
        return value;
    }

    public void deleteStack() {
        linkedList.head = null;
        System.out.println("The Stack is deleted");
    }
}
