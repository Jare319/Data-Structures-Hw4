public class Heap {

    private Entry arr[] = new Entry[600];
    private int size = 0;

    public Heap() { // default constructor

    }

    public Entry peek() {
        return arr[1];
    }

    public Entry next() {
        Entry Entry = arr[1];
        arr[1] = arr[size];
        size--;
        this.heapify(1);
        return Entry;
    }

    public Entry remove() {

        return new Entry();
    }

    public int getSize() {
        return this.size;
    }

    public void heapify(int i) {
        int largest = i;

        if (hasLeft(i) && arr[largest].getKey() < arr[left(i)].getKey()) {
            largest = left(i);
        }
        if (hasRight(i) && arr[largest].getKey() < arr[right(i)].getKey()) {
            largest = right(i);
        }

        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }
    

    public void add(Entry Entry) {
        size++;
        arr[size] = Entry;
        for (int i = this.size / 2; i > 0; i--) {
            heapify(i);
        }
    }

    private void swap(int i, int j) {
        Entry temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int parent(int i) {
        return (i / 2);
    }

    private int left(int i) {
        return (2*i);
    }

    private int right(int i) {
        return ((2*i)+1);
    }

    private boolean hasLeft(int i) {
        if (left(i) > this.size) {
            return false;
        } else {
            return true;
        }
    }

    private boolean hasRight(int i) {
        if (right(i) > this.size) {
            return false;
        } else {
            return true;
        }
    }
}
