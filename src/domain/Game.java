package domain;

public class Game extends Product {
    public Game(int i, String t, boolean l) {
        super(i, t, l);
    }

    @Override
    public double getPrice(int days) {
        return days*3;
    }

    @Override
    public String toString() {
        return "Game," + super.toString();
    }
}
