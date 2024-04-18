import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public HandSigns getHandSign() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Type following:
                1: Rock
                2: Paper
                3: Scissors
                """);
        int input = sc.nextInt();
        switch (input) {
            case 1 -> {
                return HandSigns.ROCK;
            }
            case 2 -> {
                return HandSigns.PAPER;
            }
            case 3 -> {
                return HandSigns.SCISSORS;
            }
            default -> {
                return null;
            }
        }
    }


}
