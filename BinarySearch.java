package com.mycompany.week8_skeletoncode_lab;

public class BinarySearch {

    public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = -1; // return -1 if not found instead of Integer.MAX_VALUE

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else { // found
                index = mid;
                break;
            }
        }

        return index;
    }

    // ToDo 2: Call the above method and test the algorithm
    public static void main(String[] args) {
        int[] sortedArray = {3, 9, 14, 27, 31, 42, 58, 69, 72};
        int key = 42;

        int result = runBinarySearchIteratively(sortedArray, key, 0, sortedArray.length - 1);

        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }

        // Try another example (not found)
        int missingKey = 15;
        int result2 = runBinarySearchIteratively(sortedArray, missingKey, 0, sortedArray.length - 1);
        if (result2 != -1) {
            System.out.println("Element " + missingKey + " found at index: " + result2);
        } else {
            System.out.println("Element " + missingKey + " not found in the array.");
        }
    }
}
