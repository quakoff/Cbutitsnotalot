public class HeapMax {
    private int[] data;
    private int size;

    public HeapMax(int capacity) {
        data = new int[capacity];
    }

    public void insert(int value) {
        if (size == data.length) {
            throw new IllegalStateException("Heap is full");
        }
        data[size] = value;
        size++;
        bubbleUp(size - 1);
    }

    public int remove() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int value = data[0];
        data[0] = data[size - 1];
        size--;
        bubbleDown(0);
        return value;
    }

    private void bubbleUp(int i) {
        int parentIndex = (i - 1) / 2;
        while (i > 0 && data[i] > data[parentIndex]) {
            swap(i, parentIndex);
            i = parentIndex;
            parentIndex = (i - 1) / 2;
        }
    }

    private void bubbleDown(int i) {
        int childIndex = 2 * i + 1;
        while (childIndex < size) {
            int maxIndex = childIndex;
            int rightChildIndex = childIndex + 1;
            if (rightChildIndex < size && data[rightChildIndex] > data[maxIndex]) {
                maxIndex = rightChildIndex;
            }
            if (data[i] < data[maxIndex]) {
                swap(i, maxIndex);
                i = maxIndex;
                childIndex = 2 * i + 1;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    public int size() {
        return size;
    }
}