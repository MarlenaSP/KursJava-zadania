package petle;

public class PetleZadania {
    public static void main(String[] args) {
//      Zad.1 Wypisz na ekran liczby od 0 do 30, a następnie od 30 do 0
        System.out.println("Zadanie 1");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 30; j >= 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();


//      Zad.2 Napisz program, które wypisze tylko liczby parzyste z zakresu od 0 do 30.
        System.out.println("Zadanie 2");
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

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
        System.out.println(wynik);

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
