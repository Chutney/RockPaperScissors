import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public HandSigns getHandSign() {
        Random rn = new Random();
        switch (rn.nextInt(1,4)) {
            case 1 -> {
                return HandSigns.ROCK;
            }
            case 2 -> {
                return HandSigns.PAPER;
            }
            case 3 -> {
                return HandSigns.SCISSORS;
            }
        }
        return null;
    }
}
