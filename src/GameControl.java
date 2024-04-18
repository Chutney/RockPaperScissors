public class GameControl {
    Player player1;
    Player player2;

    public GameControl(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("The game has begun!");
        int numOfRound = 0;
        boolean stopGame = false;
        while(!stopGame) {
            boolean draw = false;
            HandSigns player1Sign = player1.getHandSign();
            HandSigns player2Sign = player2.getHandSign();
            System.out.println(player1.getName() + " Chose "+ player1Sign.name());
            System.out.println(player2.getName() + " Chose "+ player2Sign.name());

            if(player1Sign.equals(HandSigns.PAPER) && player2Sign.equals(HandSigns.ROCK) ||
                    player1Sign.equals(HandSigns.ROCK) && player2Sign.equals(HandSigns.SCISSORS) ||
                    player1Sign.equals(HandSigns.SCISSORS) && player2Sign.equals(HandSigns.PAPER)) {

                player1.incrementPointByOne();
                System.out.println(player1.getName() + " won this round!!");

            } else if (player1Sign.equals(player2Sign)) {
                draw = true;
                System.out.println("It's a draw this round!");
            } else {
                player2.incrementPointByOne();
                System.out.println(player2.getName() + " won this round!");
            }
            numOfRound++;
            if(numOfRound >= 3 && !draw) {
                stopGame = true;
            }
        }
        if(player1.getPoints() > player2.getPoints()) {
            System.out.println(player1.getName() + " won the game!");
        } else {
            System.out.println(player2.getName() + " won the game!");
        }

        System.out.println(player1.getName() + " "+player1.getPoints());
        System.out.println(player2.getName() + " "+player2.getPoints());
    }
}
