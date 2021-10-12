import java.util.function.Consumer;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;


    public void addFirst(int element) {
        Node newNode = new Node(element);
        if (!isEmpty()) {
            newNode.next = head;
            this.head.prev = newNode;
        } else {
            this.tail = newNode;
        }
        this.head = newNode;
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Can't remove element from empty list");
        }
        int value = this.head.value;
        this.head = this.head.next;
        if (size > 1) {
            this.head.prev = null;
        }
        size--;
        if (isEmpty()) {
            this.head = this.tail = null;
        }
        return value;
    }

    public void addLast(int element) {
        if (isEmpty()) {
            addFirst(element);
            return;
        }
        Node newNode = new Node(element);
        this.tail.next = newNode;
        newNode.prev = this.tail;
        this.tail = newNode;
        this.size++;
    }

    public int removeLast() {
        if (this.size < 2) {
            return removeFirst();
        }
        int result = this.tail.value;
        this.tail = tail.prev;
        this.tail.next = null;
        this.size--;
        return result;
    }

    public int get(int index) {
        checkIndex(index);
        int result = 0;
        Node currentNode;
        if (index <= this.size / 2){
            currentNode = this.head;
           for (int i = 0; i < index; i++) {
               currentNode = currentNode.next;
           }
        } else {
            currentNode = this.tail;
           for (int i = size - 1; i > index; i--) {
               currentNode = currentNode.prev;
           }
        }
        result = currentNode.value;
        return result;
    }

    public void forEach(Consumer<Integer> consumer) {
        Node currentNode = this.head;
        while (currentNode != null) {
            consumer.accept(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public int[] toArray() {
        int[] array = new int[this.size];
        Node currentNode = this.head;
        int counter = 0;
        while (currentNode != null) {

            array[counter] = currentNode.value;
            currentNode = currentNode.next;
            counter++;
        }
        return array;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("The index " + index + " is out of bounds");
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
}
