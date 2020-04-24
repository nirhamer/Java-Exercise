package ru.iitdgroup.nir;

/**
 * The exercise: Replace all numbers in the array which are greater than 15 by zeros
 */
@SuppressWarnings({"squid:S106"})
public class ReplaceAllGreaterThan {
    public static void main(String[] args) {
        int[] data = new int[]{
                1, 2, 3, 4, 28, 15, 3, 14, 5, 12, -42, 31, 15
        };
        System.out.println("Original: " + Util.toString(data));
        replaceAllGreaterThan(data, 15);
        System.out.println("Replaced: " + Util.toString(data));
    }


    static void replaceAllGreaterThan(int[] data, int limit) {


        for(int i = 0; i< data.length; i++){
            if (data[i] > limit)
            data[i] = 0;
        }
    }
}
