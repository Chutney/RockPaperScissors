public class Main {

    public static void main(String[] args) {
        GameControl gc = new GameControl(new HumanPlayer("Noah"), new ComputerPlayer("PC1"));
        gc.start();
    }
}
