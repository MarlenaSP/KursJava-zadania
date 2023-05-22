package klasy;

import klasy.zadanie1.Programista;
import klasy.zadanie2.Obliczenia;
import klasy.zadanie3.Matma;

public class KlasyZadania {
    public static void main(String[] args) {
        // package "zadanie1"
        System.out.println("Zadanie 1");
        Programista programista = new Programista("Jan", "Nowakowski", "Java", 10800);
        System.out.println("Imię: " + programista.pobierzImie());
        System.out.println("Nazwisko: " + programista.pobierzNazwisko());
        System.out.println("Język: " + programista.pobierzJezyk());
        System.out.println("Wynagrodzenie: " + programista.pobierzWynagrodzenie());

        // package "zadanie2"
        System.out.println("Zadanie 2");
        int[] tablica = {5, 8, 199, 258, 12, 7};
        Obliczenia obliczenia = new Obliczenia(tablica);
        System.out.println("Suma: " + obliczenia.suma());
        System.out.println("Średnia: " + obliczenia.srednia());
        System.out.println("Wartość najmniejsza: " + obliczenia.wartoscNajmniejsza());
        System.out.println("Wartość największa: " + obliczenia.wartoscNajwieksza());

        // package "zadanie3"
        System.out.println("Zadanie 3");
        System.out.println("Obwód koła:" + Matma.obwodKola(4));
        System.out.println("Pole koła:" + Matma.poleKola(4));
        System.out.println("Obwód prostokąta:" + Matma.obwodProstokata(5, 15));
        System.out.println("Pole prostokąta:" + Matma.poleProstokata(5, 15));

    }
}

