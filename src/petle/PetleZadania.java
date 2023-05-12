package petle;

public class PetleZadania {
    public static void main(String[] args) {
//      Zadanie 1
//      Uzupełnij tablicę typu int rozmiaru 5 dowolnymi wartościami.
//      Następnie zsumuj wszystkie elementy tej tablicy i wynik wypisz na ekran.
//      Sumowania dokonaj poprzez dodawanie elementów odwołując się do indeksów tablicy.

        int[] tablica = new int[5];
        tablica[0] = 5;
        tablica[1] = 1;
        tablica[2] = 2;
        tablica[3] = 10;
        tablica[4] = 12;
//        int[] tablica = {5,1,2,10,12};

        int suma = tablica[0] + tablica[1] + tablica[2] + tablica[3] + tablica[4];
        System.out.println("Suma to: " + suma);

//      Zadanie 2
//      Utwórz tablicę dwuwymiarową typu double wymiaru 3x5 i także wypełnij dowolnymi wartościami.
//      Tym razem zsumuj elementy z każdego wiersza osobno i wypisz wynik na ekran.

        double[][] tabDwa = {
                {3.5, 5.5, 1.0, 6.7, 2.3},
                {0.5, 0.7, 0.0, 0.3, 0.5},
                {3.5555, 13.1258, 100.005, 0.6845, 22.1118554}
        };

        double pierwszyWiersz = tabDwa[0][0] + tabDwa[0][1] + tabDwa[0][2] + tabDwa[0][3] + tabDwa[0][4];
        double drugiWiersz = tabDwa[1][0] + tabDwa[1][1] + tabDwa[1][2] + tabDwa[1][3] + tabDwa[1][4];
        double trzeciWiersz = tabDwa[2][0] + tabDwa[2][1] + tabDwa[2][2] + tabDwa[2][3] + tabDwa[2][4];
        System.out.println("Pierwszy wiersz suma: " + pierwszyWiersz);
        System.out.println("Drugi wiersz suma: " + drugiWiersz);
        System.out.println("Trzeci wiersz suma: " + trzeciWiersz);

//      Zad.3 Podaj dwie dowolne liczby a i b, gdzie a jest mniejsze od b (a < b).
//      Wypisz na ekran zakres liczb od a do b.

        System.out.println("Zadanie 3");
        int a = -2;
        int b = 8;
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
//        while (a <= b) {
//            System.out.print(a + " ");
//            a++;
//        }
        System.out.println();

//      Zad.4 Utwórz tablicę rozmiaru 10 elementów i uzupełnij ją liczbami.
//      Wypisz wszystkie liczby z tej tablicy na ekran. Następnie wypisz wszystkie liczby od tyłu.

        System.out.println("Zadanie 4");
        int[] tab = {1, 8, 124, 44, 15, 2, 99, 1000, 586, 22};
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

//      Zad.5 Wykorzystując tablicę z poprzedniego zadania, oblicz sumę wszystkich jej elementów.

        System.out.println("Zadanie 5");
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            wynik += tab[i];
        }
        System.out.println(suma);

//      Zad.6 Napisz program, który będzie obliczał silnię z nieujemnej liczby tj.
//      jeżeli podamy liczbę 5, to zostanie obliczona 5!. Obliczamy to w następujący sposób:
//      5! = 5 * 4 * 3 * 2 * 1 = 120.

        System.out.println("Zadanie 6");
        int liczba = 5;
        int wynikSilnia = 1;
        for (int i = liczba; i >= 1; i--) {
            wynikSilnia *= i;
        }
        System.out.println("Wynik silnia: " + wynikSilnia);

//      Zad.7 Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) trójkąt prostokątny
//      o przyprostokątnych składających się z n-razy * (gwiazdki) ;) np. podając n = 5 powinniśmy otrzymać taki trójkąt:
//        *
//        **
//        ***
//        ****
//        *****

        System.out.println("Zadanie 7");
        int n = 5;
        int liczbaGwiazdek = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= liczbaGwiazdek; j++) {
                System.out.print("*");
            }
            System.out.println();
            liczbaGwiazdek++;
        }
//        Zad.8  Narysuj odbicie lustrzane trójkąta z poprzedniego zadania tj. dla n = 5 powinniśmy ujrzeć:
//              *
//             **
//            ***
//           ****
//          *****

        System.out.println("Zadanie 8");
        int gwiazdkaLustrzana = 1;
        int liczbaSpacji = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= liczbaSpacji; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= gwiazdkaLustrzana; k++) {
                System.out.print("*");
            }
            System.out.println();
            liczbaSpacji--;
            gwiazdkaLustrzana++;
        }

//        Zad.9  (do samodzielnego rozwiązania) Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) drzewko choinkowe o wysokości n
//        podając n = 5 powinniśmy otrzymać takie drzewko:
//            *
//           ***
//          *****
//         *******
//        *********

        System.out.println("Zadanie 9");
        int gwiazdkaDrzewko = 1;
        int liczbaSpacjiDrzewko = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= liczbaSpacjiDrzewko; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= gwiazdkaDrzewko; k++) {
                System.out.print("*");
            }
            System.out.println();
            liczbaSpacjiDrzewko--;
            gwiazdkaDrzewko = gwiazdkaDrzewko + 2;
        }
    }
}
