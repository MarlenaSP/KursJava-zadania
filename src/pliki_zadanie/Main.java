package pliki_zadanie;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("fragment.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String path = "fragment_kopia.txt";
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj szukaną frazę");
            String szukanaFraza = scanner.nextLine();

            String linia;
            int liczbaZnakow = 0;
            boolean czyZawieraFraze = false;
            int nrLini = 0;
            while ((linia = bufferedReader.readLine()) != null) {
                nrLini++;

                // a)
                //System.out.println(linia);

                // b)
                liczbaZnakow += linia.length();

                // c)
                if (linia.toLowerCase().contains(szukanaFraza)) {
                    czyZawieraFraze = true;
                }

                // d)
                if ((linia.toLowerCase()).contains(szukanaFraza)) {
                    System.out.println(nrLini + ": " + linia);
                }

                // e)
                bufferedWriter.write(linia + "\n");
            }
            System.out.println();
            System.out.println("Liczba znaków: " + liczbaZnakow);
            System.out.println("Czy zawiera frazę: " + czyZawieraFraze);
            bufferedWriter.write("\nKopia pliku utorzona prze Jan Kowalski");

            bufferedReader.close();
            bufferedWriter.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.out.println("Problem z wczytywaniem pliku...");
        }
    }
}
