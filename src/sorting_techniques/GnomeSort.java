package sorting_techniques;

import tools.SortingTools;

public class GnomeSort {
    public static void gnomeSort(int array[]) {
        int i = 0;
        while (i < array.length) {
            if (i == 0 || array[i] > array[i - 1]) {
                i++;
            } else {
                SortingTools.swap(array, i, i - 1);
                i--;
            }
        }
    }
}
