/**
 * This class utilizes a recursive backtracker to solve the sudoku board.
 */
public class sudokuSolver {

    /**
     * Recursive backtracking algorithm to find correct values for all cells.
     * @param board the sudoku board
     * @return true if board is completely solved, false if cell value is incorrect
     */
    public static boolean backtracker(Board board) {

        int num, r, c;
        int[] empty = findPlaceholder(board);
        r = empty[0];           // row location of empty cell
        c = empty[1];           // column location of empty cell

        if (r == -1){           // no empty cells exist
            return true;
        }
        for (num = 1; num <= 9; num++){
            if (ruleCheck(board, r, c, num)) {
                board.getCell(r, c).setVal(String.valueOf(num));
                if (backtracker(board)){
                    return true;
                }
                board.getCell(r, c).setVal(".");
            }
        }
        return false;
    }

    /**
     * Checks to ensure that if num is placed on the board, none of the rules of sudoku are broken.
     * @param board the sudoku board
     * @param row the row where num is located
     * @param col the column where num is located
     * @param num the value of the cell at (row, col)
     * @return true if num can be placed on the board, otherwise false
     */
    private static boolean ruleCheck(Board board, int row, int col, int num) {

        String number = String.valueOf(num);
        int r, c;

        // check that num is not already in row
        for (c = 0; c < 9; c++) {
            if (board.getCell(row, c).getVal().equals(number)) {        // if num is found in row
                return false;                                           // return false, failed the rule check
            }
        }

        // check that num is not already in column
        for (r = 0; r < 9; r++) {
            if (board.getCell(r, col).getVal().equals(number)) {        // if num is found in column
                return false;                                           // return false, failed the rule check
            }
        }

        // check that num is not already in subgrid
        for (r = 0; r < 3; r++) {
            for (c = 0; c < 3; c++) {                                   // if num is found in subgrid
                if (board.getCell((r + (row - row % 3)), (c + (col - col % 3))).getVal().equals(number)) {
                    return false;                                       // return false, failed the rule check
                }
            }
        }
        return true;                                            // passed the rule check, return true
    }

    /**
     * Searches the board to find the next cell with a placeholder character (".").
     * @param board the sudoku board
     * @return a row and column location for the next cell
     */
    private static int[] findPlaceholder(Board board) {

        int[] coor = new int[2];
        int r, c;
        coor[0] = -1;                               // if these values are not changed
        coor[1] = -1;                               // no more empty cells exist

        for (r = 0; r < 9; r++) {
            for (c = 0; c < 9; c++) {
                if (board.getCell(r, c).isEmpty()) {
                    coor[0] = r;
                    coor[1] = c;
                    return coor;
                }
            }
        }
        return coor;
    }

}
