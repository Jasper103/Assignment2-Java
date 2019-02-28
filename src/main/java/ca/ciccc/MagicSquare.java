package ca.ciccc;

/**
 *
 * Magic Squares are square arrays of numbers that have the interesting property that
 * the numbers in each column, and in each row, all add up to the same total.
 *
 * Given an n x n square of numbers, determine if it is magic square.
 *
 * Reference: {@link java.lang.Integer}
 * Integer is a wrapper class for {@code int} primitive type.
 */
public class MagicSquare {
    /* n rows and n cols square */
    private int n;
    /* 2-Dimensional array to represent the square */
    private Integer[][] square;

    /**
     * Constructor that takes n as the number of rows and cols.
     * @param n number of rows and cols.
     */
    public MagicSquare(int n) {
        this.n = n;
    }

    /**
     * Constructor that takes n as the number of rows and cols.
     * Initializes square 2-Dimensional array.
     * @param n number of rows and cols.
     * @param square
     */
    public MagicSquare(int n, Integer[][] square) {
        this.n = n;
        this.square = square;
    }

    /**
     * Getter for square
     * @return {@code this.square}
     */
    public Integer[][] getSquare() {
        return square;
    }

    /**
     * Setter for square.
     * @param square
     */
    public void setSquare(Integer[][] square) {
        this.square = square;
    }

    /**
     * Check if {@code square} is magic square or not.
     * @param square 2-Dimensional array
     * @return {@code true} if {@code square} is magic, otherwise {@code false}
     *
     * Sample Input
     * {
     *   {16, 3, 2, 13},
     *   {5, 10, 11, 8},
     *   {9, 6, 7, 12},
     *   {4, 15, 14, 1}
     * }
     *
     * Sample Output
     * true
     *
     * Explanation: The sums of each row and col are equal.
     */
    public static boolean isMagicSquare(Integer[][] square) {
        int totalSupposedToBe = 0;
        int squareHeight = square.length;

        for (int c = 0; c < squareHeight; ++c) {
            int firstRowTotal = 0;

            for (int r = 0; r < squareHeight; ++r) {
                firstRowTotal += square[r][c];
            }

            totalSupposedToBe = firstRowTotal;
        }

        for (int r = 1; r < squareHeight; ++r) {
            int rowTotal = 0;

            for (int c = 0; c < squareHeight; ++c) {
                rowTotal += square[r][c];
            }

            if (rowTotal != totalSupposedToBe) {
                return false;
            }
        }

        for (int c = 0; c < squareHeight; ++c) {
            int columnTotal = 0;

            for (int r = 0; r < squareHeight; ++r) {
                columnTotal += square[r][c];
            }

            if (columnTotal != totalSupposedToBe) {
                return false;
            }
        }

        return true;
    }

//    public static boolean isMagicSquare(Integer[][] square) {
//        boolean ismagicsquare = false;
//        int sum1 = 0;
//        int sum2 = 0;
//        sum1 = square.length;
//        sum1 = sum2;
//        int sumh = 0;//new int[sum1];
//        int suml = 0;//new int[sum1];
//        int sumd1 = 0;//new int[2];
//        int sumd2 = 0;
//        for(int i = 0;i < square.length;i++) {
//            for(int j = 0;j < square[i].length;j++) {
//                suml += square[i][j];
//            }
//        }
//        for(int i = square.length;i >= 0;i--) {
//            for(int j = 0;j < square.length;j++) {
//                sumh += square[i][j];
//            }
//        }
//        for(int i = 0;i < square.length;i++) {
//            sumd1 += square[i][i];
//        }
//        for(int j = square.length;j >= 0;j--) {
//            sumd2 += square[j][j];
//        }
//        if(sumh == suml) {
//            ismagicsquare = true;
//        }
//        else {
//            ismagicsquare = false;
//        }
//        return  ismagicsquare;
//    }

    /**
     * Check if {@code this.square} is magic square or not.
     * @return {@code true} if {@code square} is magic, otherwise {@code false}
     */
    public boolean isMagicSquare() {
        return isMagicSquare(this.square);
    }
}
