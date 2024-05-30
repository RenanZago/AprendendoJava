public class Main {
    public static void main(String[] args) {

        int[] array = {29, 12, 3, 7, 2, 17, 4, 19, 42, 31, 20, 15, 10, 9, 16, 8, 1, 13, 21, 5};

        quicksort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static int partition(int[] array, int low, int high) {
        int X = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= X) {
                i = i + 1;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    public static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int q = partition(array, low, high);
            quicksort(array, low, q - 1);
            quicksort(array, q + 1, high);
        }
    }
}