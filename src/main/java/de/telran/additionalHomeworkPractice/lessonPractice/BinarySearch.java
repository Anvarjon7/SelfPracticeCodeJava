package de.telran.javaPro_lessonPracticCode.module1.lessonPractice;

public class BinarySearch {
        public static void main(String[] args) {
            int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int target = 6;

            int result = binarySearch(sortedArray, target);

            if (result != -1) {
                System.out.println("Элемент " + target + " найден в индексе " + result);
            } else {
                System.out.println("Элемент " + target + " не найден в массиве");
            }
        }

        public static int binarySearch(int[] array, int target) {
            return binarySearchHelper(array, target, 0, array.length - 1);
        }

        private static int binarySearchHelper(int[] array, int target, int left, int right) {
            if (left <= right) {
                int mid = left + (right - left) / 2;

                if (array[mid] == target) {
                    return mid; // Найден искомый элемент
                } else if (array[mid] < target) {
                    return binarySearchHelper(array, target, mid + 1, right); // Искомый элемент в правой половине
                } else {
                    return binarySearchHelper(array, target, left, mid - 1); // Искомый элемент в левой половине
                }
            }

            return -1; // Элемент не найден
        }
    }


