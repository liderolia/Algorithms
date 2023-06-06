package Algorithms.homework;

public class hw_s02 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 2, 3, 4, 2, 1, 1, 2,
                3, 4, 4, 2, 3, 1, 4, 2, 3, 4, 2, 1, 2, 3, 4,
                2, 1, 3, 4, 2, 1, 2, 3, 4, 4, 2, 3, 3, 2, 4 };
        countingSort(array);
    }

    static void countingSort(int[] array) {
        int[] count = new int[array.length];
        for (int number : array) {
            count[number]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println("количество " + i + " в массиве: " + count[i]);
            }
        }
    }
}
