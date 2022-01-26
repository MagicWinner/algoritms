package tk.magicwinner.algoritms;

import java.util.Arrays;

public class Main {

    static Integer[] array = new Integer[] {5, 123, 1, 612, 66, 72, 34, 15, 28, 20};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleIntegerArraySort(array))); // bubble sort int array
        System.out.println(fibanacci(100)); // inputs 3736710778780434371
        System.out.println(factorial(5)); // inputs 120
    }

    public static long fibanacci(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

    public static long factorial(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;

        for (int i = 3; i <= n; i++) {
            array[i] = i * array[i-1];
        }
        return array[n];
    }

    public static Integer[] bubbleIntegerArraySort(Integer[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1 ; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
