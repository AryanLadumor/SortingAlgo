package main_menu;

import java.util.*;
import tools.DisplayTools;
import tools.SortingTools;

public class Main implements SortingTools, DisplayTools {
    public static void main(String[] args) {
        int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        // int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // BubbleSort.bubbleSort(a);
        // BubbleSort.modifiedBubbleSort(a);
        // CocktailShakerSort.cocktailShakerSort(a);
        // OddEvenSort.oddEvenSort(a);
        // SelectionSort.doubleSelectionSort(a);
        // SelectionSort.modifiedSelectionSort(a);
        // SelectionSort.selectionSort(a);
        // SelectionSort.stableSelectionSort(a);
        // PancakeSort.pancakeSort(a);
        // InsertionSort.insertionSort(a);
        // GnomeSort.gnomeSort(a);
        // CountingSort.countingSort(a);
        // CountingSort.stableCountingSort(a);
        // MergeSort.mergeSort(a);
        DisplayTools.Print(a);
        Arrays.sort(a);

        System.err.println();

    }
}
