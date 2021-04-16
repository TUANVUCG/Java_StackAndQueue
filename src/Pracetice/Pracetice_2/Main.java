package Pracetice.Pracetice_2;

public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(8);
        System.out.println("\t" + queue.dequeue().key);
    }
}
