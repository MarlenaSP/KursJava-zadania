package watki;

public class ZadaniaWatki {
    public static void main(String[] args) {

        // Zadanie 1
        Thread threadAnonimowy = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Ta informacja została wypisana z klasy anonimowej i z mojego wątku");
            }
        });
        threadAnonimowy.start();

        // Zadanie 2
        Thread czasoodmierzaczThread = new Thread(new Czasoodmierzacz());
        czasoodmierzaczThread.start();

        //Zadanie 3
        Scigacz scigaczPierwszy = new Scigacz("Ścigacz nr 1");
        Scigacz scigaczDrugi = new Scigacz("Ścigacz nr 2");
        Thread scigaczPierwszyThread = new Thread(scigaczPierwszy);
        Thread scigaczDrugiThread = new Thread(scigaczDrugi);
        scigaczPierwszyThread.start();
        scigaczDrugiThread.start();
    }
}
