
package testprogram2;


public class DoublyLinkedList<E> {
    private Node<E> header; // sentinel node before the first element
    private Node<E> trailer; // sentinel node after the last element
    private int size; // number of elements in the list

    // Inner class representing a node in the doubly linked list
    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addBetween(E element, Node<E> predecessor, Node<E> successor) {
        Node<E> newNode = new Node<>(element, predecessor, successor);
        predecessor.setNext(newNode);
        successor.setPrev(newNode);
        size++;
    }

    public void addFirst(E element) {
        addBetween(element, header, header.getNext());
    }

    public void addLast(E element) {
        addBetween(element, trailer.getPrev(), trailer);
    }

    public E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        return remove(trailer.getPrev());
    }

    public void ForwardTraversal() {
        Node<E> current = header.getNext();
        while (current != trailer) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void BackwardTraversal() {
        Node<E> current = trailer.getPrev();
        while (current != header) {
            System.out.print(current.getElement() + " ");
            current = current.getPrev();
        }
        System.out.println();
    }
}

    

