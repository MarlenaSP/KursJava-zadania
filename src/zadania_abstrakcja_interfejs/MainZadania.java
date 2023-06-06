package zadania_abstrakcja_interfejs;

import zadania_abstrakcja_interfejs.zadanie1.GwiazdaSmierci;
import zadania_abstrakcja_interfejs.zadanie2.Kolo;
import zadania_abstrakcja_interfejs.zadanie2.Prostokat;

public class MainZadania {
    public static void main(String[] args) {
        // Zadanie 1
        System.out.println("Zadanie 1");
        GwiazdaSmierci gwiazdaSmierci = new GwiazdaSmierci();
        gwiazdaSmierci.atakujLaserem();

        // Zadanie 2
        System.out.println("Zadanie 2");
        Kolo kolo = new Kolo(5);
        Prostokat prostokat = new Prostokat(2,5);
        System.out.println("Koło obwód: " + kolo.pole());
        System.out.println("Koło pole: " + kolo.obwod());
        System.out.println("Prostokąt obwód: " + prostokat.pole());
        System.out.println("Prostokąt pole: " + prostokat.obwod());
    }
}
