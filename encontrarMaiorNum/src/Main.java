public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 9, 5, 11};

        int maior = 0;
        int indice = 0;

        maior = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maior) {
                maior = nums[i];
                indice = i;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Indice: " + indice);

    }
}