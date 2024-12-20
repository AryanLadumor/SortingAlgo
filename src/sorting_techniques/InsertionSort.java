package sorting_techniques;

public class InsertionSort {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n ; i++) {
            int curr = array[i];
            int prev = i - 1;

            while (prev >= 0 && array[prev] > curr) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = curr;
        }
    }

}
