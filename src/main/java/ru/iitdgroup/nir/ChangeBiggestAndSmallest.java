package ru.iitdgroup.nir;

/**
 * The exercise: Change the position of the biggest and the smallest number in the array
 */
@SuppressWarnings({"squid:S106"})
public class ChangeBiggestAndSmallest {
    public static void main(String[] args) {
        int[] data = new int[]{
                1, 2, 3, 4, 5, 28, 3, 14, 2, 12, -42, 31, 15
        };
        System.out.println("Original: " + Util.toString(data));
        swapBiggestAndSmallest(data);
        System.out.println(" Swapped: " + Util.toString(data));
    }

    /**
     * Change the position of the biggest and the smallest number in the array
     *not use utility array/collation
     * @param data array to work with
     */
    static void swapBiggestAndSmallest(int[] data) {
        /*
         ===== CREATE CODE HERE =====
         */
    }
}
