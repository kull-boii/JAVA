class MultiDim_arr {
    
    public static void main(String[] args) {
        // create a 2d array
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7 }, };

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);


        // create a 2d array
        int[][] matrix = { { 1, -2, 3 }, { -4, -5, 6, 9 }, { 7 }, };

        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] row : matrix) {
            // second for...each loop access each element inside the row
            for (int element : row) {
                System.out.println(element);
            }
        }



    }


}
