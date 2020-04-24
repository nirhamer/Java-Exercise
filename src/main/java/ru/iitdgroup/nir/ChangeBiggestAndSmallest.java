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
    public static void swapBiggestAndSmallest(int[] data) {

        int maxIndex = indexOfMax(data);
        System.out.println("Index of Maximum index is: "+maxIndex);

        int minIndex = indexOfMin(data);
        System.out.println("Index of Minimum Value is: "+minIndex);

        int tmp = data[maxIndex];
        data[maxIndex] = data[minIndex];
        data[minIndex] = tmp;

    }


    public static int indexOfMax (int [] data) {
        int index = 0;
        int min = data[index];

        for (int i=1; i<data.length; i++) {


            if (data[i] > min) {
                min = data[i];
                index = i;
            }

        }
        return index;
    }


    public static int indexOfMin (int [] data) {
        int index = 0;
        int min = data[index];

        for (int i=1; i<data.length; i++) {


            if (data[i] < min) {
                min = data[i];
                index = i;
            }

        }
        return index;
    }

}