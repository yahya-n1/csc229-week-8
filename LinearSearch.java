package com.mycompany.week8_skeletoncode_lab;

public class LinearSearch {

    public static int search(int arr[], int x) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i; // element found, return index
            }
        }

        return -1; // element not found
    }

    // ToDo 1: Test the linear search algorithm
    public static void main(String[] args) {
        int[] numbers = {3, 8, 15, 23, 42, 56, 72};
        int key = 23;

        System.out.println("Searching for " + key + " in the array...");
        int result = search(numbers, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found in the array.");
    }
}
