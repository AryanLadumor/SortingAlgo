package sorting_visulization;

import tools.SortingTools;
import tools.DisplayTools;

public class CocktailShakerSortVizulization implements SortingTools, DisplayTools{

    public static void cocktailShakerSort(int array[], boolean viewInner, Boolean viewOuter) {
        int n = array.length;
        int i = 0;
        boolean sorted;
        do {
            if (viewOuter) {
                System.out.println(DisplayTools.viewOuter(array) + i);
            }
            sorted = true;
            for (int j = 0+i; j < n - 1-i; j++) {
                if (array[j] > array[j + 1]) {
                    SortingTools.swap(array, j, j + 1);
                    sorted = false;
                }
                if (viewInner) {
                    System.out.println(DisplayTools.viewInner(array) + j);
                }
            }

            if (sorted) {
                break;
            }

            if (viewOuter) {
                System.out.println(DisplayTools.viewOuter(array) + i);
            }
            sorted = true;
            for (int j = n - 2-i; j >= 0+i; j--) {
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
