package ru.iitdgroup.nir;

/**
 * Misc utils
 */
public class Util {
    private Util() {
        //do not create instance of this class
    }

    /**
     * Print an in array human-readable way
     *
     * @param data array to print
     * @return String. An array in format {1,1,2,3,5}
     */
    public static String toString(int[] data) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]);
            if (i < data.length - 1) sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }

}
