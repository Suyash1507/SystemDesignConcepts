package TicTacToeGame2;

public class gameDemo {
    public static void main(String[] args) {
        System.out.println("\n===>>> TicTacToe Game\n");
        Game game = new Game();
        game.initializeGame();

        GameStatus status = game.startGame();
        System.out.print("\n===>>> GAME OVER: ");
        switch(status){
            case WIN:
                System.out.print(game.winner.name + " won the game");
                break;
            case DRAW:
                System.out.println("It's a DRAW! Well played both!");
                break;
            default:
                System.out.println(" Game Ends!!");
                break;
        }
    }
}
