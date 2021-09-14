class Array2D9 {

    public static void main(String[] args) {

        int[][] arr = new int[10][20];
        arr[0][0] = 1;

        int[][] matrix = { { 1, 2 }, { 3, 4 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }

    }

}
