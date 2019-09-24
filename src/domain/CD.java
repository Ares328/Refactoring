package domain;

public class CD extends Product {
    public CD(int i, String t, boolean l) {
        super(i, t, l);
    }

    @Override
    public double getPrice(int days) {
        return 1.5*days;
    }

    @Override
    public String toString() {
        return "CD," + super.toString();
    }
}
