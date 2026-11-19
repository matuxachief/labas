package labs.laba4_1;

public class MinStackImpl implements MinStack<Integer> {
    private Node head;

    @Override
    public void push(Integer value) {
        int number = value;
        int currentMin = number;
        if (head != null && head.getMin() < number) {
            currentMin = head.getMin();
        }
        head = new Node(number, currentMin, head);
    }

    @Override
    public Integer pop() {
        if (head == null) {
            return null;
        }
        int number = head.getValue();
        head = head.getNext();
        return number;
    }

    @Override
    public Integer top() {
        if (head == null) {
            return null;
        }
        return head.getValue();
    }

    @Override
    public Integer min() {
        if (head == null) {
            return null;
        }
        return head.getMin();
    }
}