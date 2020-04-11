package ru.iitdgroup.nir;

/**
 * The exercise: Replace all numbers in the array which are greater than 15 by zeros
 */
@SuppressWarnings({"squid:S106"})
public class RepaceAllGreaterThan {
    public static void main(String[] args) {
        int[] data = new int[]{
                1, 2, 3, 4, 28, 15, 3, 14, 5, 12, -42, 31, 15
        };
        System.out.println("Original: " + Util.toString(data));
        replaceAllGreaterThan(data, 15);
        System.out.println("Replaced: " + Util.toString(data));
    }

    /**
     * Replace all numbers in the array which are greater than 15 by zeros
     *
     * @param data array to work with
     * @param limit number to compare with
     */
    static void replaceAllGreaterThan(int[] data, int limit) {
        /*
         ===== CREATE CODE HERE =====
         */
    }
}
