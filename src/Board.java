import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A Board is a 2D array of Cells that represents the current state of the sudoku puzzle.
 */
public class Board {

    private Cell[][] board = new Cell[9][9];
    private int r;
    private int c;

    /**
     * Creates the initial puzzle from the user-given file using Cells.
     * @param filename for the unsolved sudoku puzzle
     * @throws FileNotFoundException if sudoku input file was not found
     */
    public Board(String filename) throws FileNotFoundException{
            char elem;
            try (Scanner in = new Scanner(new File(filename))) {
            in.nextLine();
            for (r = 0; r < 9; r++) {
                for (c = 0; c < 9; c++) {
                    elem = in.next().charAt(0);
                    this.setCell(r, c, new Cell(String.valueOf(elem)));
                }
            }
        }
    }

    /**
     * Gets the cell from a given position.
     * @param r indicates current row
     * @param c indicates current column
     * @return cell at position (r, c)
     */
    public Cell getCell(int r, int c) {
        return this.board[r][c];
    }

    /**
     * Sets the cell value at a given position.
     * @param r indicates current row
     * @param c indicates current column
     * @param Cell cell at position (r, c)
     */
    public void setCell(int r, int c, Cell Cell) {
        this.board[r][c] = Cell;
    }

    /**
     * A visual representation of the sudoku board.
     * @return a string representing the puzzle
     */
    @Override
    public String toString(){
        String result = "";
        for(r = 0; r < 9; r++){
            if (r % 3 == 0) {
                result += "\n";
            }
            for(c = 0; c < 9; c++){
                if (c % 3 == 0) {
                    result += " ";
                }
                result += this.getCell(r, c).getVal() + " ";
            }
            result += "\n";
        }
        return result;
    }

}