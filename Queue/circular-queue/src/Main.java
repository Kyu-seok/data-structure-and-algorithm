public class Main {

    public static void main(String[] args) {
        CircularQueue newCQ = new CircularQueue(3);
        newCQ.enQueue(10);
        newCQ.enQueue(20);
        newCQ.enQueue(30);
        newCQ.deleteQueue();
    }

}
