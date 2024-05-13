package lesson26.example02;

// пишем руками связный список
public class MyLinkedList {
    private Node first;
    private Node last;
    private int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(String value) {
        Node newNode = new Node(value);
        if (size == 0) {
            first = newNode;
            last = newNode;
            size = 1;
            return;
        }
        // связываем последний элемент с новым
        // задаем последнему элементу новый как следующий
        last.setNext(newNode);
        // задаем новому элементу последний как предыдущий
        newNode.setPrev(last);
        // обновляем ссылку на последний элемент
        last = newNode;
        size++;
    }

    private Node getNode(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void add(String value, int index) {
        if (index < 0 || index > size) {
            return;
        }
        // Если пытаемся вставить элемент в конец,
        if (index == size) {
            // вызываем другую перегрузку метода (она будет делать это эффективнее)
            add(value);
        }
        Node previous = getNode(index - 1);
        Node newNode = new Node(value);

        newNode.setNext(previous.next);
        previous.setNext(newNode);
        newNode.setPrev(previous);
        newNode.next.setPrev(newNode);
        last = newNode;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        Node previous = getNode(index - 1);

        previous.setNext(previous.next.next);
        previous.next.setPrev(previous);

        size--;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return getNode(index).value;
    }

    public void set(String value, int index) {
        if (index < 0 || index >= size) {
            return;
        }
        getNode(index).value = value;
    }

    private static class Node {
        private String value;
        private Node next;
        private Node prev;

        public Node(String value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        public Node(String value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
}

