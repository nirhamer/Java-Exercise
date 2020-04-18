package ru.iitdgroup.nir;

import java.util.Arrays;
import java.util.Collections;

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
     *
     * @param data array to work with
     */
    public static void swapBiggestAndSmallest(int[] data) {
        int numbers[] = new int[]{1, 2, 3, 4, 5, 28, 3, 14, 2, 12, -42, 31, 15};
        int smallest = numbers[0];
        int biggest = numbers[0];

        for(int i=1; i< numbers.length; i++)
        {
            if(numbers[i] > biggest)
                biggest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];

        }

        System.out.println("Largest Number is : " + biggest);
        System.out.println("Smallest Number is : " + smallest);
    }
}
