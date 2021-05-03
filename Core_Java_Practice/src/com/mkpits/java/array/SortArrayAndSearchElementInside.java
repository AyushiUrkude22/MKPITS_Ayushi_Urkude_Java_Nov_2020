package src.com.mkpits.java.array;
// sort an array and search an element inside it.

import java.util.Arrays;
public class SortArrayAndSearchElementInside {
        public static void main(String args[]) throws Exception {
            int array[] = { 3, 2, -5, 6, 3, -8, 0, 7, 6, -4 };
            Arrays.sort(array);
            printArray("Sorted array", array);
            int index = Arrays.binarySearch(array, 2);
            System.out.println("Found 2 @ " + index);
        }
        private static void printArray(String message, int array[]) {
            System.out.println(message + ": [length: " + array.length + "]");

            for (int i = 0; i < array.length; i++) {
                if(i != 0) {
                    System.out.print(", ");
                }
                System.out.print(array[i]);
            }
            System.out.println();
        }
    }