package helicopter;

public class Copter extends Sprite {
    public Copter(char symbol, int row, int col) {
        super(symbol, row, col);
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
