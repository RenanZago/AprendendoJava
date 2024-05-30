public class Main {
    public static void main(String[] args) {
        int[] array = {29, 12, 3, 7, 2, 17, 4, 19, 42, 31, 20, 15, 10, 9, 16, 8, 1, 13, 21, 5};

        shellsort(array, array.length);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] array, int index1, int index2) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
    }

    public static void shellsort(int[] array, int n) {
        int gap = n / 2;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int j = i;
                while (j >= gap && array[j - gap] > array[j]) {
                    swap(array, j, j - gap);
                    j -= gap;
                }
            }
            gap /= 2;
        }
    }
}