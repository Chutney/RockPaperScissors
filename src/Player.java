public abstract class Player {
    private String name;
    private int points;

    public Player(String name) {
        this.name = name;
    }

    public void incrementPointByOne() {
        points++;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    abstract HandSigns getHandSign();
}
