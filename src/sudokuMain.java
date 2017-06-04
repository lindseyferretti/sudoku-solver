import java.io.FileNotFoundException;

/**
 * Main class for sudoku solver.
 */
public class sudokuMain {

    /**
     * Main method that calls the Board class.
     * @param args filename for the unsolved sudoku puzzle
     * @throws FileNotFoundException if sudoku input file was not found
     */
    public static void main(String[] args) throws FileNotFoundException {

        // create the initial puzzle from the file
        Board board = new Board(args[0]);
        System.out.println(board.toString());

        // attempt to solve the puzzle

        // indicate whether there was a solution or not

    }

}
