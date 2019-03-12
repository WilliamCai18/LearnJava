package com.sort;

public class MergeSort {
    private static void merge(int[] a, int low, int mid, int high) {
        int[] tmp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = a[i++];
        }
        while (j <= high) {
            tmp[k++] = a[j++];
        }
        if (tmp.length >= 0) System.arraycopy(tmp, 0, a, low, tmp.length);
    }

    private static void mergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 1, 6, 9, 7, -1, 8, 5, 3};
        mergeSort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
