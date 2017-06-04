/**
 * Cells are individual units that hold one value.
 */
public class Cell {
    
    private String value;

    /**
     * Creates one Cell with an initial value.
     * @param value the current value of the cell
     */
    public Cell(String value) {
        this.value = value;
    }

    /**
     * Get the current value that the cell is holding.
     * @return the current value of the cell
     */
    public String getVal() {
        return this.value;
    }

    /**
     * Set the current value that the cell will hold.
     * @param value the current value of the cell
     */
    public void setVal(String value) {
        this.value = value;
    }

    /**
     * Compares two cells to see if their values are equal.
     * @param o other cell
     * @return true if values are equal, otherwise false
     */
    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o instanceof Cell) {
            Cell c = (Cell) o;
            result = this.value.equals(c.value);
        }
        return result;
    }

}
