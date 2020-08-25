package com.example.test;

public class BinarySearchTest {

    public static void main(String[] args) {
        int[] arr = {5, 13, 19, 21, 37, 56, 64, 75, 80, 88, 92};
        int result = recursionBinarySearch(arr, 75, 0, 10);
        System.out.println("result:" + result);
        int result2 = recursionBinarySearch2(arr, 75);
        System.out.println("result2:" + result2);
    }

    private static int recursionBinarySearch(int[] arr, int key, int low, int high) {
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }
        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            return recursionBinarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            return recursionBinarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }
    }

    private static int recursionBinarySearch2(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

