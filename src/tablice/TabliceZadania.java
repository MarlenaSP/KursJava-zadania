package tablice;

public class TabliceZadania {
    public static void main (String[] args) {
//        Zadanie 1
//        Uzupełnij tablicę typu int rozmiaru 5 dowolnymi wartościami.
//        Następnie zsumuj wszystkie elementy tej tablicy i wynik wypisz na ekran.
//        Sumowania dokonaj poprzez dodawanie elementów odwołując się do indeksów tablicy.

        int[] tablica = new int [5];
        tablica[0] = 5;
        tablica[1] = 1;
        tablica[2] = 2;
        tablica[3] = 10;
        tablica[4] = 12;
//        int[] tablica = {5,1,2,10,12};

        int suma = tablica[0]+tablica[1]+tablica[2]+tablica[3]+tablica[4];
        System.out.println("Suma to: " + suma);

//        Zadanie 2
//        Utwórz tablicę dwuwymiarową typu double wymiaru 3x5 i także wypełnij dowolnymi wartościami.
//        Tym razem zsumuj elementy z każdego wiersza osobno i wypisz wynik na ekran.

        double [][] tabDwa= {
                {3.5, 5.5, 1.0, 6.7, 2.3},
                {0.5, 0.7, 0.0, 0.3, 0.5},
                {3.5555, 13.1258, 100.005, 0.6845, 22.1118554}
        };

        double pierwszyWiersz = tabDwa[0][0]+tabDwa[0][1]+tabDwa[0][2]+tabDwa[0][3]+tabDwa[0][4];
        double drugiWiersz = tabDwa[1][0]+tabDwa[1][1]+tabDwa[1][2]+tabDwa[1][3]+tabDwa[1][4];
        double trzeciWiersz = tabDwa[2][0]+tabDwa[2][1]+tabDwa[2][2]+tabDwa[2][3]+tabDwa[2][4];
        System.out.println("Pierwszy wiersz suma: " + pierwszyWiersz);
        System.out.println("Drugi wiersz suma: " + drugiWiersz);
        System.out.println("Trzeci wiersz suma: " + trzeciWiersz);








    }
}
