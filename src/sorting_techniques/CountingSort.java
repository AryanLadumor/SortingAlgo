package sorting_techniques;

public class CountingSort {
    public static void countingSort(int array[]) {
        int n = array.length;
        int max = array[0];
        int j = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, array[i]);
        }

        int count[] = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[array[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    

    public static void stableCountingSort(int array[]) {
        int n = array.length;
        int max = array[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, array[i]);
        }

        int count[] = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[array[i]]++;
        }

        int output[] = new int[n];

        for (int i = 1; i <= max; i++) {
            count[i]+=count[i-1];
        }

        for(int i=0;i<n;i++)
        {
            output[count[array[i]]-1]=array[i];
            count[array[i]]--;
        }

        System.arraycopy(output,0,array,0,max);
    }

}
