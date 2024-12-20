package sorting_techniques;

public class MergeSort {
    public static void mergeSort(int array[]) {
        divide(array, 0, array.length - 1);
    }

    public static void divide(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        divide(array, si, mid);
        divide(array, mid + 1, ei);

        merge(array, si, mid, ei);
    }

    public static void merge(int array[], int si, int mi, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mi + 1;
        int k = 0;
        while (i <= mi && j <= ei) {
            if (array[j] < array[i]) {
                temp[k++] = array[j++];
            } else {
                temp[k++] = array[i++];
            }
        }

        while (i <= mi) {
            temp[k++] = array[i++];
        }
        while (j <= ei) {
            temp[k++] = array[j++];
        }

        i = si;
        k = 0;
        while (k < temp.length) {
            array[i++] = temp[k++];
        }
    }

}