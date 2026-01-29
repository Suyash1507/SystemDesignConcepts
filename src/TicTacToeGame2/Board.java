package TicTacToeGame2;
import java.util.*;


public class Board {
    public int size;
    public PlayingPiece[][] board;

    Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int columnm, PlayingPiece piece) {
        if (board[row][columnm] != null) {
            return false;
        }
        board[row][columnm] = piece;
        return true;
    }

    public List<Cell> getFreeCells(){
        List<Cell> freeCells = new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    freeCells.add(new Cell(i,j) );
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++) {
                if(board[i][j]!=null){
                    System.out.print(board[i][j].pieceType.name() + "   ");
                }
                else{
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
            }
    }




}

class Cell {
    public int row;
    public int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
