import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[][] matrix = { { "A", "B", "A" }, { "B", "B", "C" }, { "A", "C", "C" } };

        String[] AnswerKey = { "A", "B", "C" };

        for (String[] row : matrix) {
            int i = 0;
            int sum = 0;
            for (String data : row) {
                if (data == AnswerKey[i]) {
                    sum++;
                }
                i++;
            }
            System.out.println(sum);
        }

    }
}
