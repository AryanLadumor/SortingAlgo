package sorting_visulization;

import tools.SortingTools;
import tools.DisplayTools;

public class OddEvenSortVizulization implements SortingTools, DisplayTools {
    public static void oddEvenSort(int array[], boolean viewInner, Boolean viewOuter) {
        int n = array.length;
        boolean sorted;
        int i = 0;
        do {

            if (viewOuter) {
                System.out.println(DisplayTools.viewOuter(array) + i);
            }
            sorted = true;
            for (int j = 0; j < n - 1; j += 2) {
                if (array[j] > array[j + 1]) {
                    SortingTools.swap(array, j, j + 1);
                    sorted = false;
                }
                if (viewInner) {
                    System.out.println(DisplayTools.viewInner(array) + j);
                }
            }
            if (viewOuter) {
                System.out.println(DisplayTools.viewOuter(array) + i);
            }

            for (int j = 1; j < n - 1; j += 2) {
                if (array[j] > array[j + 1]) {
                    SortingTools.swap(array, j, j + 1);
                    sorted = false;
                }
                if (viewInner) {
                    System.out.println(DisplayTools.viewInner(array) + j);
                }
            }
            i++;
        } while (!sorted);
    }
}
