package klasy.zadanie3;

public class Matma {
    public static final double PI = 3.14;

    public static double obwodKola(double r) {
        double obwod = 0;
        obwod = 2 * PI * r;
        return obwod;
    }

    public static double poleKola(double r) {
        double pole = 0;
        pole = PI * (r * r);
        return pole;
    }

    public static int obwodProstokata(int a, int b) {
        int obwod = 0;
        obwod = 2 * (a + b);
        return obwod;
    }

    public static int poleProstokata(int a, int b) {
        int pole = 0;
        pole = a * b;
        return pole;
    }
}
