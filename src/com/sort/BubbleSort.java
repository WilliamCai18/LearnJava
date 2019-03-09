package com.sort;

public class BubbleSort {
    private static void bubbleSort(int[] array) {
        int len = array.length;
        int tmp;
        for (int i = 0; i < len - 1; ++i) {
            for (int j = len - 1; j > i; --j) {
                if (array[j] < array[j-1]) {
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 9, 8, 7, 6, 0, 1, 3, 2};
        bubbleSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
