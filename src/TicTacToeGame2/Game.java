package TicTacToeGame2;
import java.util.*;
public class Game {

    Deque<Player> players;
    Board gameBoard;
    Player winner;

    public void initializeGame(){
        //creating 2 players
        players = new LinkedList<>();

        PlayingPieceX pieceX = new PlayingPieceX();
        Player player1 = new Player("Player1", pieceX);

        PlayingPieceO pieceO = new PlayingPieceO();
        Player player2 = new Player("Player2", pieceO);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public GameStatus startGame(){
        boolean noWinner = true;

        while(noWinner){
            //// Remove the player whose turn is and also put the player in the list back
            Player currentPlayer = players.removeFirst();

            // Get the free space from the board
            gameBoard.printBoard();
            List<Cell> freeCells = gameBoard.getFreeCells();
            if(freeCells.isEmpty()){
                noWinner=false;
                continue;
            }

            //read input
            System.out.print("Player: " + currentPlayer.name + " - Please enter [row, column]: ");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // Place the piece in the board
            boolean validMove = gameBoard.addPiece(inputRow, inputColumn, currentPlayer.piece);

            if(!validMove){
                // Invalid Move: Player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again!");
                players.addFirst(currentPlayer); // Add the player back to the queue(in the front)
                continue;
            }
            players.addLast(currentPlayer); // add player to end

            boolean isWinner  = checkForWinner(inputRow, inputColumn, currentPlayer.piece.pieceType);
            if(isWinner){
                gameBoard.printBoard();
                winner = currentPlayer;
                return GameStatus.WIN;
            }

        }
        return GameStatus.DRAW;
    }

    public boolean checkForWinner(int row, int column, PieceType pieceType){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //CHECK ROW
        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType){
                rowMatch = false;
                break;
            }
        }

        //CHECK COLUMN
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
                break;
            }
        }

        //CHECK DIAGONAL
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
                break;
            }
        }


        //CHECK ANTI DIAGONAL
        for(int i=0, j= gameBoard.size-1; i< gameBoard.size; i++, j--){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType){
                antiDiagonalMatch = false;
                break;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}

