package tools;

public interface SortingTools {

    // implemented method to swap two element with their index
    public static void swap(int array[], int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void flip(int array[], int index) {
        int i = 0;
        int j = index;
        while (i <= j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }

    public static void flip(int array[], int index1, int index2) {
        int i = index1;
        int j = index2;
        while (i <= j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }

    public static void reverse(int array[]) {
        int start = 0;
        int end = array.length - 1;
        flip(array, start, end);
    }

    public static void minElementIndex(int a[])
    {
        int minIndex=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[minIndex]>a[i])
            {
                minIndex=i;
            }
        }

    }

}
