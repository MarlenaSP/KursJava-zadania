package zadania_abstrakcja_interfejs.zadanie2;

public class Kolo implements Figury {
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double obwod() {
        return 2 * Math.PI * r;
    }

    @Override
    public double pole() {
        return Math.PI * r * r;
    }
}
