package labs.labs1;

import java.util.Arrays;

public class Ydalenie {

    public int removeElementInPlace(int[] arr, int val) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Ydalenie task = new Ydalenie();

        int[] arr1 = {4, 5, 5, 4};
        int val1 = 4;
        int result1 = task.removeElementInPlace(arr1, val1);
        System.out.println("Output: " + result1);
        System.out.println("Array: " + Arrays.toString(arr1));

        int[] arr2 = {0, 2, 6, 6, 1, 0, 4, 6};
        int val2 = 6;
        int result2 = task.removeElementInPlace(arr2, val2);
        System.out.println("\nOutput: " + result2);
        System.out.println("Array: " + Arrays.toString(arr2));
    }
}