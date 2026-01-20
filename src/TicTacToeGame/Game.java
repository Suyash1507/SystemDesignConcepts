package TicTacToeGame;
import java.util.*;

public class Game {
    private Board board;
    private Queue<Player> players;

    public Game(int boardSize, Player p1, Player p2) {
        board = new Board(boardSize);
        players = new LinkedList<>();
        players.add(p1);
        players.add(p2);
    }

    public void Start(){
        Scanner sc = new Scanner(System.in);
        Player currentPlayer = players.poll();
        board.printBoard();

        System.out.println(currentPlayer.getName() + "'s turn. Enter row and col:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        Move move = new Move(row, col, currentPlayer.getSymbol());
        if(!board.placeMove(move)){
            System.out.println("Invalid move. Try again.");
            players.add(currentPlayer);
        }

        if(board.checkWinner(currentPlayer.getSymbol())){
                board.printBoard();
            System.out.println(currentPlayer.getName() + " WINS 🎉");
                return;
        }

        else if(board.isFull()){
                board.printBoard();
                System.out.println("It's a draw!");
                return;
            } else {
                players.add(currentPlayer);
            }


    }
}
