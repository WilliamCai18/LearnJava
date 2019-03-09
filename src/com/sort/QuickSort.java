package com.sort;

public class QuickSort {
    private static void sort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            sort(array, low, pivot-1);
            sort(array, pivot+1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        while (low < high) {
            while (low < high && array[high] >= pivot) {
                --high;
            }
            array[low] = array[high];
            while (low < high && array[low] <= pivot){
                ++low;
            }
            array[high] = array[low];
        }
        array[low] = pivot;
        return low;
    }

    private static void quickSort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 9, 8, 7, 6, 0, 1, 3, 2};
        quickSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
