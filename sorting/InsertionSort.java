package sorting;
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {41, 53, 20, 8, 33};
        System.out.println("Original array:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
