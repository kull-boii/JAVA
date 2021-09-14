import java.util.Scanner;

class IO4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            System.out.println("the input no was " + array[i]);
        }

    }
}
