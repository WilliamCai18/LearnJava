package com.sort;

public class InsertionSort {
    private static void insertionSort(int[] a) {
        if (a != null) {
            for (int i = 1; i < a.length; i++) {
                int temp = a[i];
                int j = i;
                if (a[j - 1] > temp) {
                    while (j >= 1 && a[j - 1] > temp) {
                        a[j] = a[j - 1];
                        j--;
                    }
                }
                a[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 3, 19, 40, 4, 7, 1};
        insertionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
