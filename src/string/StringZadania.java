package string;

public class StringZadania {
    public static void main(String[] args) {
        /*
        Zad.1
        */
        System.out.println("Zadanie 1");
        String imie = "Jan";
        String nazwisko = "Nowakowski";
        String imieNazwisko = "Jan Nowakowski";
        // a)
        System.out.println("imię: "+ imie.length());
        System.out.println("nazwisko: "+ nazwisko.length());
        System.out.println("imię i nazwisko: "+ imieNazwisko.length());
        // b)
        if (imie.equals("Alicja")){
            System.out.println("Masz na imię Alicja");
        } else if (imie.equals("Jan")) {
            System.out.println("Masz na imię Jan");
        }else System.out.println("Nie masz na imię Alicja ani Jan");
        // c)
        System.out.println(nazwisko.toUpperCase());
        // d)
        System.out.println("zamiana a -> e: " + nazwisko.replace('a', 'e'));

        /*
        Zad.2
         */
        System.out.println("Zadanie 2");
        String zdanie = "Potrafię coraz więcej z programowania.";
        for (int i =0; i< zdanie.length(); i++) {
            System.out.println(zdanie.charAt(i));
        }
        /*
        Zad.3
        */
        System.out.println("Zadanie 3");
        for(int i=zdanie.length()-1; i>=0; i--){
            System.out.print(zdanie.charAt(i));
        }
    }
}
