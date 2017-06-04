import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Class representing the current state of the sudoku board.
 */
public class Board {

    private int r, c;
    private char[][] board;

    /**
     * Creates the initial puzzle from the user-given file.
     * @param filename for the unsolved sudoku puzzle
     * @throws FileNotFoundException if sudoku input file was not found
     */
    public Board(String filename) throws FileNotFoundException{
            //int r, c;
            char elem;
            //char[][] board;
            try (Scanner in = new Scanner(new File(filename))) {
            in.nextLine();
            board = new char[9][9];
            for (r = 0; r < 9; r++) {
                for (c = 0; c < 9; c++) {
                    elem = in.next().charAt(0);
                    board[r][c] = elem;
                }
            }
        }
    }

    /**
     * A visual representation of the sudoku board.
     * @return a string representing the puzzle
     * */
    @Override
    public String toString(){
        //int r, c;
        // prints the initial puzzle
        String result = "";
        for(r = 0; r < 9; r++){
            if (r % 3 == 0) {
                result += "\n";
            }
            for(c = 0; c < 9; c++){
                if (c % 3 == 0) {
                    result += " ";
                }
                result += board[r][c] + " ";
            }
            result += "\n";
        }
        return result;
    }

}