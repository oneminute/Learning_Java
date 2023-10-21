public class LinkedList {

    // nested class Node
    public class Node {
        private int value;
        private Node next = null;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node() {

        }

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int length = 0;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public LinkedList() {

    }

    public void append(int value) {
        Node n = new Node(value);
        if (tail == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        length++;
    }

    public int getValue(int index) throws Exception {
        if (index >= length || index < 0)
            throw new Exception("Illegal index");
        int i = 0;
        Node c = head;
        int target = 0;
        while (c != null) {
            if (i == index) {
                target = c.getValue();
                break;
            }
            c = c.next;
        }
        return target;
    }
    
    public String toString() {
        String str = "";
        Node c = head;
        while(c != null)
        {
            str += c.getValue();
            str += ", ";
            c = c.next;
        }
        return str;
    }
}
