package labs.laba4_1;

public class Node {
    private final int value;
    private final int min;
    private final Node next;

    public Node(int value, int min, Node next) {
        this.value = value;
        this.min = min;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public int getMin() {
        return min;
    }

    public Node getNext() {
        return next;
    }
}