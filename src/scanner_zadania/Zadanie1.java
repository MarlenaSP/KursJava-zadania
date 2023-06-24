package scanner_zadania;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();
        String nazwisko = scanner.next();
        String wzrost = scanner.next();
        System.out.println(" Jestem " + imie + " " + nazwisko + " i mam " + wzrost + " cm wzrostu");
    }
}

