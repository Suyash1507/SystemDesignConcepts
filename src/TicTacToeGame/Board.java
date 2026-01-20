package TicTacToeGame;

public class Board {
    private int size;
    private char[][] grid;

    public Board(int size){
        this.size = size;
        grid = new char[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                grid[i][j] = '-';
            }
        }

    }

    public boolean placeMove(Move move) {
        if (grid[move.getRow()][move.getCol()] != '-') {
            return false;
        }
        grid[move.getRow()][move.getCol()] = move.getSymbol();
        return true;
    }

    public boolean isFull() {
        for (char[] row : grid)
            for (char cell : row)
                if (cell == '-') return false;
        return true;
    }

    public boolean checkWinner(char symbol) {
        // Rows
        for (int i = 0; i < size; i++) {
            boolean win = true;
            for (int j = 0; j < size; j++) {
                if (grid[i][j] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // Columns
        for (int j = 0; j < size; j++) {
            boolean win = true;
            for (int i = 0; i < size; i++)
                win &= grid[i][j] == symbol;
            if (win) return true;
        }

        // Diagonals
        boolean win = true;
        for (int i = 0; i < size; i++)
            win &= grid[i][i] == symbol;
        if (win) return true;

        win = true;
        for (int i = 0; i < size; i++)
            win &= grid[i][size - i - 1] == symbol;
        return win;
    }

    public void printBoard() {
        for (char[] row : grid) {
            for (char cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }
    }




}
