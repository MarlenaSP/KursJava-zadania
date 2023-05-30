package wyjatki;

import wyjatki.zadanie3.Matma;

public class WyjatkiZadania {
    public static void main(String[] args) {

//        Zadanie 1

        try {
            int a = 20;
            int b = 0;
            System.out.println("Wynik a/b = " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Nie wolno dzielić przez 0!");
        }

//        Zadanie 2

        try {
            System.out.println(podziel(6, 0));
        } catch (PodzielonePrzezZeroException e) {
            System.out.println("Nie wolno dzielić przez 0!");
        }

//        Zadanie 3
        Matma.obwodKola(-5);

    }

    public static int podziel(int a, int b) throws PodzielonePrzezZeroException {
        if (b == 0) {
            throw new PodzielonePrzezZeroException();
        }
        return a / b;
    }

}