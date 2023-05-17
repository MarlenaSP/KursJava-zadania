package instrukcje_warunkowe;

public class InstrukcjeZadania {
    public static void main (String[] args) {
//        Zadanie 1. Sprawdź czy wpisana liczba jest parzysta czy nieparzysta. Wypisz odpowiedni komunikat na ekran.
//        (podpowiedź: jeżeli reszta z dzielenia przez 2 jest równa 0 to znaczy, że liczba jest parzysta).

        int liczba = 13;
        if (liczba % 2 == 0) {
            System.out.println(liczba + " Liczba parzysta");
        } else {
            System.out.println(liczba + " Liczba nieparzysta");
        }

//        Zadanie 2. Oliczenie podatku od dochodu. Wzór:
//        dla dochodu do 85 528 zł podatek wynosi 17%,
//        dla dochodu powyżej 85 528 zł liczy się go następująco:
//          - obliczamy podatek 17% z 85 528,
//          - dodatkowo obliczamy podatek 32% od nadwyżki ponad 85 528 zł (czyli dochód pomniejszony o 85 528 zł i z tego 32%)
//        (oczywiście obliczamy orientacyjnie, gdyż nie bierzemy pod uwagę np. ulgi podatkowej).

        double dochod = 56400;

        if (dochod < 0) {
            System.out.println("Brak podatku do zapłaty");
        } else if (dochod <= 85528) {
            double podatek = dochod * 0.17;
            System.out.println("Podatek do zapłaty wynosi: "+ podatek);
        } else {
            double podatek = (85528 * 0.17) + ((dochod - 85528)* 0.32);
            System.out.println("Podatek 32% do zapłaty wynosi:" + podatek);
        }


//        Zadanie 3 kalkulator
//        Napisz bardzo prosty kalkulator. Niech potrafi dodawać, odejmować, mnożyć i dzielić. Co więcej,
//        niech będzie na tyle prostym kalkulatorem, że po podaniu  dwóch liczb, obliczy wynik i zakończy
//        swoje działanie.
//        (podpowiedź: będziesz potrzebował co najmniej trzech zmiennych - dwie zmienne do przechowywania liczb
//        oraz trzecia zmienna jako znak operacji np. '+' dla dodawania)
//        (podpowiedź 2: znak operacji możesz przechowywać w zmiennej typu char)

        double pierwszaLiczba = 10;
        double drugaLiczba = 4;
        char znak = '/';
        double wynik = 0;

        switch (znak) {
            case '+':
                wynik = pierwszaLiczba + drugaLiczba;
                break;
            case '-':
                wynik = pierwszaLiczba - drugaLiczba;
                break;
            case '*':
                wynik = pierwszaLiczba * drugaLiczba;
                break;
            case '/':
                wynik = pierwszaLiczba / drugaLiczba;
                break;
            default:
                System.out.println("Podałeś nieprawidłowy znak");
        }
        System.out.println(pierwszaLiczba + " " + znak + " " + drugaLiczba + " = " + wynik);


    }
}
