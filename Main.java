package javaCore.Lesson2;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 0, 5};
        System.out.println(countEvens(array));
        System.out.println(diffMaxMin(array));
        System.out.println(doubleZero(array));

    }

    public static int countEvens(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public static int diffMaxMin(int[] array) {
        return maxArray(array) - minArray(array);
    }

    public static boolean doubleZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && array[i + 1] == 0 && array[i + 1] < array.length){
                return true;
            }
        }
        return false;
    }

    public static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

}
