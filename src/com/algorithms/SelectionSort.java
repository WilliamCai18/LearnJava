package com.algorithms;

public class SelectionSort {
    public static void selectionSort(int[] a) {
        int i, j;
        int temp, flag;
        int n = a.length;
        for (i = 0; i < n; i++) {
            temp = a[i];
            flag = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] < temp) {
                    temp = a[j];
                    flag = j;
                }
            }
            if (flag != i) {
                a[flag] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 9, 8, 7, 6, 0, 1, 3, 2, -1};
        selectionSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
