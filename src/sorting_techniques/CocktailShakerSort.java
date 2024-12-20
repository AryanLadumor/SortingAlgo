package sorting_techniques;

import tools.SortingTools;

public class CocktailShakerSort implements SortingTools {
    public static void cocktailShakerSort(int array[]) {
        int n = array.length;
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    SortingTools.swap(array, i, i + 1);
                    sorted = false;
                }
            }

            if (sorted) {
                break;
            }

            sorted = true;
            for (int i = n - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    SortingTools.swap(array, i, i + 1);
                    sorted = false;
                }
            }
        } while (!sorted);
    }
}