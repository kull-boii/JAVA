
// To use Arrays.toString() method
import java.util.Arrays;

class Multi_dimArray1 {

    public static void main(String[] args) {
        int[] n1 = { 2, 3, 12, 4, 12, -2 };

        int[] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];

        // copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));
    }

}
