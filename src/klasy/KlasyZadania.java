package klasy;

import klasy.zadanie1.Programista;
import klasy.zadanie2.Obliczenia;

public class KlasyZadania {
    public static void main(String[] args) {
        // package "zadanie1"
        System.out.println("Zadanie 1");
        Programista programista = new Programista("Jan", "Nowakowski", "Java", 10800);
        System.out.println("Imię: " + programista.pobierzImie());
        System.out.println("Nazwisko: " + programista.pobierzNazwisko());
        System.out.println("Język: " + programista.pobierzJezyk());
        System.out.println("Wynagrodzenie: " + programista.pobierzWynagrodzenie());

        // // package "zadanie2"
        System.out.println("Zadanie 2");
        int[] tablica = {5, 8, 199, 258, 12, 7};
        Obliczenia obliczenia = new Obliczenia(tablica);
        System.out.println("Suma: " + obliczenia.suma());
        System.out.println("Średnia: " + obliczenia.srednia());
        System.out.println("Wartość najmniejsza: " + obliczenia.wartoscNajmniejsza());
        System.out.println("Wartość największa: " + obliczenia.wartoscNajwieksza());

    }


}

