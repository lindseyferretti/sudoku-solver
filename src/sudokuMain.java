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

        Board b = new Board(args[0]);
        System.out.println(b.toString());
        System.out.println(b.getCell(0,1).getVal());
        b.getCell(0,1).setVal("2");
        System.out.println(b.getCell(0,1).getVal());

        System.out.println(b.getCell(0,1).equals(b.getCell(2,6)));
        System.out.println(b.getCell(0,1).equals(b.getCell(2,8)));

        // create the initial puzzle from the file
        //Board board = new Board(args[0]);
        //System.out.println(board.toString());

        // attempt to solve the puzzle

        // indicate whether there was a solution or not

    }

}
