package scanner_zadania;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int liczba;
        while ((liczba= scanner.nextInt()) >= 0) {
            suma += liczba;
        }
        System.out.println("Wynik= " + suma);
    }
}
