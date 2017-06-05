import java.io.FileNotFoundException;

/**
 * Main class for sudoku solver.
 */
public class sudokuMain {

    /**
     * Main method that calls the Board and sudokuSolver classes.
     * @param args filename for the unsolved sudoku puzzle
     * @throws FileNotFoundException if sudoku input file was not found
     */
    public static void main(String[] args) throws FileNotFoundException {

        Board board = new Board(args[0]);                                   // create initial puzzle from file
        System.out.println("Initial Puzzle:\n" + board.toString());

        if (sudokuSolver.backtracker(board)){                               // attempt to solve the puzzle
            System.out.println("Puzzle Solution:\n" + board.toString());    // indicate whether there was a solution or not
        }
        else {
            System.out.println("No solution found.");
        }
    }

}
