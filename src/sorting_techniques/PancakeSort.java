package sorting_techniques;

import tools.SortingTools;

public class PancakeSort {
    public static void pancakeSort(int array[]) {
        int n = array.length;

        for (int i = n - 1; i >= 0; i--) {
            int maxE = findMaxElemwntIndex(array, i);

            if (i != maxE) {
                SortingTools.flip(array, maxE);
                SortingTools.flip(array, i);
            }
        }

    }

    public static int findMaxElemwntIndex(int array[], int n) {
        int maxE = 0;
        for (int i = 1; i <= n; i++) {
            if (array[maxE] < array[i]) {
                maxE = i;
            }
        }
        return maxE;
    }
}
