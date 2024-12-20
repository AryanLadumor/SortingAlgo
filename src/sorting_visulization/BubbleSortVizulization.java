package sorting_visulization;

import tools.SortingTools;
import tools.DisplayTools;

public class BubbleSortVizulization implements SortingTools, DisplayTools {

    public static void bubbleSort(int[] array, boolean viewInner, Boolean viewOuter) {
        int n = array.length;
        if (viewInner) {
            viewOuter = true;
        }
        for (int i = 0; i < n - 1; i++) {
            if (viewOuter) {
                System.out.println(DisplayTools.viewOuter(array) + i);
            }
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    SortingTools.swap(array, j, j + 1);
                }
                if (viewInner) {
                    System.out.println(DisplayTools.viewInner(array) + j);
                }
            }
        }
    }

    public static void modifiedBubbleSort(int array[], boolean viewInner, Boolean viewOuter) {
        int n = array.length;
        boolean swapped;
        if (viewInner) {
            viewOuter = true;
        }
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            if (viewOuter) {
                System.out.println(DisplayTools.viewOuter(array) + i);
            }
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    SortingTools.swap(array, j, j + 1);
                    swapped = true;
                }
                if (viewInner) {
                    System.out.println(DisplayTools.viewInner(array) + j);
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
