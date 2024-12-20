package sorting_techniques;

import tools.SortingTools;

public class SelectionSort implements SortingTools {
    public static void selectionSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[minElementIndex] > array[j]) {
                    minElementIndex = j;
                }
            }
            SortingTools.swap(array, minElementIndex, i);
        }
    }

    public static void modifiedSelectionSort(int array[]) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n; i++) {
            int minElementIndex = i;
            swapped = false;
            for (int j = i + 1; j < n; j++) {
                if (array[minElementIndex] > array[j]) {
                    minElementIndex = j;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            if (minElementIndex != i) {
                SortingTools.swap(array, minElementIndex, i);
            }
        }
    }

    public static void stableSelectionSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[minElementIndex] > array[j]) {
                    minElementIndex = j;
                }
            }
            int key = array[minElementIndex];
            while (minElementIndex > i) {
                array[minElementIndex] = array[minElementIndex - 1];
                minElementIndex--;
                array[i] = key;
            }
        }
    }

    public static void doubleSelectionSort(int array[]) {
        int right = array.length - 1;
        int left = 0;
        while (left <= right) {

            int minElementIndex = left;
            int maxElementIndex = right;
            for (int i = left; i <= right; i++) {
                minElementIndex = (array[left] > array[i]) ? i : minElementIndex;
                maxElementIndex = (array[left] < array[i]) ? i : maxElementIndex;
            }

            SortingTools.swap(array, minElementIndex, left);
            if (maxElementIndex == left) {
                maxElementIndex = minElementIndex;
            }
            SortingTools.swap(array, maxElementIndex, right);

            left++;
            right--;
        }
    }
}
