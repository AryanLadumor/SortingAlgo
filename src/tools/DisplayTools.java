package tools;

import java.util.Arrays;

public interface DisplayTools {

    public static void Print(int array[]) {
        System.out.println(Arrays.toString(array));
    }

    public static String viewOuter(int array[]) {
        return Arrays.toString(array) + " ~~~";
    }

    public static String viewInner(int array[]) {
        return Arrays.toString(array) + " ~";
    }
}