package zmienne_operatory;

public class Zadania {
    public static void main(String[] args) {
//       Zad. 1 Utwórz trzy zmienne i przypisz do nich wartości i wypisz je na ekran:
//       wiek (lata), wzrost (metry), waga (kg)

        int wiek = 42;
        float wzrost = 1.74f;
        float waga = 60.50f;
        System.out.println("wiek: " + wiek + " lat");
        System.out.println("wzrost: " + wzrost + " m");
        System.out.println("waga: " + waga + " kg");

//      Zad. 2 Na podstawie powyższych danych oblicz Twoje BMI. BMI = waga / wzrost ^ 2

        float bmi = waga / (wzrost*wzrost);
        System.out.println("Twoje BMI: " + bmi);

//      Zad. 3 Skonwertuj wynik na liczbę całkowitą

        int bmiInt = (int) bmi;
        System.out.println("Twoje BMI: " + bmiInt);

//      Zad. 4 Podaj dowolną liczbę typu całkowitego.
//      Następnie oblicz wynik dzielenia oraz resztę z dzielenia przez liczby 2, 3 oraz 11.

        System.out.println("Zadanie 4");
        int liczba = 110;
        int wynikDzielenia;
        int resztaZDzielenia;

        wynikDzielenia = liczba/2;
        resztaZDzielenia = liczba%2;
        System.out.println(liczba + " / 2 = " + wynikDzielenia);
        System.out.println(liczba + " % 2 = " + resztaZDzielenia);

        wynikDzielenia = liczba/3;
        resztaZDzielenia = liczba%3;
        System.out.println(liczba + " / 3 = " + wynikDzielenia);
        System.out.println(liczba + " % 3 = " + resztaZDzielenia);

        wynikDzielenia = liczba/11;
        resztaZDzielenia = liczba%11;
        System.out.println(liczba + " / 11 = " + wynikDzielenia);
        System.out.println(liczba + " % 11 = " + resztaZDzielenia);


    }
}