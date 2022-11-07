public class Heap {

    private Entry arr[];
    private int size;
    private boolean readData;

    public Heap() { // default constructor
        arr = new Entry[600];
        size = 0;
        readData = false;
    }

    public boolean getRead() {
        return readData;
    }

    public void setRead(boolean read) {
        this.readData = read;
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

    public void remove(int index) {
        arr[index] = arr[this.size];
        this.size--;
        for (int i = this.size / 2; i > 0; i--) {
            heapify(i);
        }
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
    
    public void add(Entry entry) {
        size++;
        arr[size] = entry;
        for (int i = this.size / 2; i > 0; i--) {
            heapify(i);
        }
    }

    public int contains(Patient patient) {
        for (int i = 1; i <= size; i++) {
            if (arr[i].getPatient().equals(patient)) {
                return i;
            }
        }
        return -1;
    }

    public Entry getEntry(int i) {
        return arr[i];
    }

    public void updatePriority(int i, String unosStatus) {
        this.arr[i].getPatient().addPastStatus(this.arr[i].getPatient().getUnosStatus());
        this.arr[i].getPatient().addPastStatusDate(java.time.LocalDate.now().toString());
        this.arr[i].getPatient().setUnosStatus(unosStatus);
        this.arr[i].updatePriority();
        for (int j = this.size / 2; j > 0; j--) {
            heapify(j);
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
