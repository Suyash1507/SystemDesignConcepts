package TicTacToeGame;

public class Demo {
    public static void main(String[] args) {
        Player p1 = new Player("Player 1", 'X');
        Player p2 = new Player("Player 2", 'O');

        Game game = new Game(3, p1, p2);
        game.Start();
    }
}
