package scanner_zadania;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(";");
        String tekst;
        while (!(tekst = scanner.next()).toLowerCase().equals("x")) {
            System.out.println(tekst);
        }
    }
}
