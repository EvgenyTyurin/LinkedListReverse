/**
 * Reverse a linked list: iteration method reverse pointers on every node
 * of a list
 */

public class LinkedListReverse {

    public static void main(String[] args) {
        // Create linked list 1->2->3->4->5
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(new MyLinkedList.Node(1));
        linkedList.add(new MyLinkedList.Node(2));
        linkedList.add(new MyLinkedList.Node(3));
        linkedList.add(new MyLinkedList.Node(4));
        linkedList.add(new MyLinkedList.Node(5));
        // Iteration method needs 3 pointers
        MyLinkedList.Node<Integer> current = linkedList.head;
        MyLinkedList.Node<Integer> prev = null;
        MyLinkedList.Node<Integer> next = null;
        // Reverse pointers direction on every node
        while (current != null) {
            next = current.next();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        // Last will be the first!
        linkedList.head = prev;
        // 5->4->3->2->1
        System.out.println(linkedList);
    }
}
