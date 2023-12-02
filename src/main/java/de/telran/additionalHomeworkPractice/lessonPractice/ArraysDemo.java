package de.telran.javaPro_lessonPracticCode.module1.lessonPractice;

import java.sql.Array;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 4, 7, 8, 3};
        int sum = 7;
        findPair(arr, sum);
        countOccurrences(arr);
    }
    public static void findPair(int[] arr, int sum) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int count = arr[left] + arr[right];
            if (count == sum) {
                System.out.println("Pair found: " + arr[left] + ", " + arr[right]);
                left++;
                right--;
            } else if (count < sum) {
                left++;
            } else {
                right--;
            }
        }
    }
    public static void countOccurrences(int[] arr){
        int maxElem = Arrays.stream(arr).max().orElse(-1);
        int[] occurrences = new int[maxElem + 1];

        for (int elem : arr) {
            occurrences[elem]++;
        }
        for (int i = 0; i < occurrences.length; i++) {
            if(occurrences[i] > 0){
                System.out.println("Element " + i + " meets " + occurrences[i] + " times");
            }
        }
    }

    public static void removeDuplicates(int[] arr){

    }

}










//- Дан массив/коллекция целых чисел и целое число X. Найти пару чисел в массиве/коллекции, сумма которых равна X.
// - Дан массив/коллекция целых чисел. Необходимо подсчитать, сколько раз каждый элемент встречается в массив/коллекции.
// - Дан массив/коллекция. Удалить все дубликаты из массива/коллекции.
// - Дан массив/коллекция целых чисел. Необходимо переставить элементы массив/коллекции в обратном порядке.