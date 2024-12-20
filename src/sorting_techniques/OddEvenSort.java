package sorting_techniques;

import tools.SortingTools;

public class OddEvenSort implements SortingTools{
    public static void oddEvenSort(int array[]) {
        int n = array.length;
        boolean sorted;
        do {
            sorted = true;

            for (int i = 0; i < n - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    SortingTools.swap(array, i, i + 1);
                    sorted = false;
                }
            }

            for (int i = 1; i < n - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    SortingTools.swap(array, i, i + 1);
                    sorted = false;
                }
            }

        } while (!sorted);
    }
}
