public class Heap {

    private Node arr[] = new Node[600];
    private int size = 0;

    public Heap() { // default constructor

    }

    public Node peek() {
        return arr[1];
    }

    public Node next() {
        Node node = arr[1];
        arr[1] = null;
        this.heapify();
        return node;
    }

    public Node remove() {

        return new Node();
    }

    public int size() {
        return this.size;
    }

    public void heapify() {

    }

    public void add(Node node) {
        arr[size + 1] = node;
        size++;
        //System.out.println("Heap is full "); // In a real program, this is where the array would be resized
    }
}
