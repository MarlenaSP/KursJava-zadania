package scanner_zadania;

import java.util.Scanner;

public class Zadsnie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj linię tekstu");
        String linia = scanner.nextLine();
        System.out.println("Podaj liczbę linii");
        int liczbaLinii = scanner.nextInt();
        for (int i = 0; i < liczbaLinii; i++) {
            System.out.println(linia);
        }
    }
}
