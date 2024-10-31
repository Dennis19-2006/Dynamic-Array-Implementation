import java.util.ArrayList;

public class DynamicArray {
    private ArrayList<Integer> array;

    public DynamicArray() {
        array = new ArrayList<>();
    }

    // Insert value at a specific index
    public void insert(int index, int value) {
        if (index < 0 || index > array.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        array.add(index, value);
    }

    // Delete value at a specific index
    public void delete(int index) {
        if (index < 0 || index >= array.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        array.remove(index);
    }

    // Traverse and print the array
    public void traverse() {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
