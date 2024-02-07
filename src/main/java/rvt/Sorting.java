package rvt;

public class Sorting {
    public static int smallest(int[] arr) {
        int smallestNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            smallestNum = smallestNum > arr[i] ? arr[i] : smallestNum;
        }
        return smallestNum;
    }

    public static int indexOfSmallest(int[] arr) {
        int smallestNum = arr[0];
        int smallestNumI = 0;

        for (int i = 0; i < arr.length; i++) {
            if (smallestNum > arr[i]) {
               smallestNum = arr[i];
               smallestNumI = i;
            }
        }
        return smallestNumI;
    }

    public static int indexOfSmallestFrom(int[] arr, int startIndex) {
        int smallestNum = arr[startIndex];
        int smallestNumI = startIndex;

        for (int i = startIndex; i < arr.length; i++) {
            if (smallestNum > arr[i]) {
               smallestNum = arr[i];
               smallestNumI = i;
            }
        }
        return smallestNumI;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int smallestI;
        for (int i = 0; i < array.length; i++) {
            smallestI = indexOfSmallestFrom(array, i);
            swap(array, i, smallestI);
        }
    }
}
