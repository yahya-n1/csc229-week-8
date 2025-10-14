package com.mycompany.week8_skeletoncode_lab;

public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;

        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if (a[inner] > a[inner + 1]) { // swap if out of order
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }

    // ToDo 3: Test the algorithm
    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        System.out.println("Before sorting:");
        printArray(numbers);

        bubbleSort(numbers, numbers.length);

        System.out.println("After sorting:");
        printArray(numbers);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
