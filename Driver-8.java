
public class Driver {
    public static void main(String[] args) {
        Game[] game = new Game[2];
        game[0] = new Game("Human");
        game[1] = new Game("Computer");

        int turn;
        turn = 0;

        while(!game[0].isWinner() && !game[1].isWinner())
        {
            game[turn].roll();
            game[turn].addToScore((game[turn].getPoints()));
            if(game[0].isWinner())
            {
                System.out.println(game[0].getName() + " wins with " + game[0].getPoints()
                        + " points.");
            }
            else
            {
                System.out.println(game[1].getName() + " wins with " + game[1].getPoints()
                        + " points.");
            }
        }
    }
}