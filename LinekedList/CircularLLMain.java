public class CircularLLMain {
    public static void main(String[] args) {
        CircularLL ll = new CircularLL();

        ll.insertAtBegin(3,3);
        ll.insertAtBegin(2,2);
        ll.insertAtBegin(1,1);
        ll.printLL();

        ll.moveNodeToFront(ll.head.next.next);
        ll.printLL();
    }
}
