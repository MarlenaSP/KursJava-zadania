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
    }
}
