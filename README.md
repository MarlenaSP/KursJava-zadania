# KursJava-zadania

Package zmienne_operatory - treść zadań:
1. Utwórz trzy zmienne i przypisz do nich wartości: wiek (lata), wzrost (metry), waga (kg), wypisz zmienne na ekran.
2. Na podstawie powyższych danych oblicz Twoje BMI, wzór: BMI = waga / wzrost ^ 2.
3. Skonwertuj wynik na liczbę całkowitą.
4. Podaj dowolną liczbę typu całkowitego. Następnie oblicz wynik dzielenia oraz resztę z dzielenia przez liczby 2, 3 oraz 11.

Package instrukcje_wrunkowe - treść zadań:
1. Sprawdź czy wpisana liczba jest parzysta czy nieparzysta. Wypisz odpowiedni komunikat na ekran.
2. Oblicz podatek od dochodu (orientacyjnie, gdyż nie bierzemy pod uwagę np. ulgi podatkowej). Wzór: 
- dla dochodu do 85 528 zł podatek wynosi 17%,
- dla dochodu powyżej 85 528 zł liczy się go następująco: obliczamy podatek 17% z 85 528, następnie obliczamy podatek 32% od nadwyżki ponad 85 528 zł (czyli dochód pomniejszony o 85 528 zł i z tego 32%) 
3. Napisz bardzo prosty kalkulator. Niech potrafi dodawać, odejmować, mnożyć i dzielić. Co więcej, niech będzie na tyle prostym kalkulatorem, że po podaniu dwóch liczb, obliczy wynik i zakończy swoje działanie. 

Package tablice - treść zadań:
1. Uzupełnij tablicę typu int rozmiaru 5 dowolnymi wartościami. Następnie zsumuj wszystkie elementy tej tablicy i wynik wypisz na ekran. Sumowania dokonaj poprzez dodawanie elementów odwołując się do indeksów tablicy.
2. Utwórz tablicę dwuwymiarową typu double wymiaru 3x5 i także wypełnij dowolnymi wartościami. Tym razem zsumuj elementy z każdego wiersza osobno i wypisz wynik na ekran.

Package pętle - treść zadań:
1. Wypisz na ekran liczby od 0 do 30, a następnie od 30 do 0.
2. Napisz program, które wypisze tylko liczby parzyste z zakresu od 0 do 30.
3. Podaj dwie dowolne liczby a i b, gdzie a jest mniejsze od b (a < b). Wypisz na ekran zakres liczb od a do b.
4. Utwórz tablicę rozmiaru 10 elementów i uzupełnij ją liczbami. Wypisz wszystkie liczby z tej tablicy na ekran. Następnie wypisz wszystkie liczby od tyłu.
5. Wykorzystując tablicę z poprzedniego zadania, oblicz sumę wszystkich jej elementów.
6. Napisz program, który będzie obliczał silnię z nieujemnej liczby tj. jeżeli podamy liczbę 5, to zostanie obliczona 5!. Wzór silni: 5! = 5 * 4 * 3 * 2 * 1 = 120.
7. Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) trójkąt prostokątny o przyprostokątnych składających się z n-razy * (gwiazdki) ;) np. podając n = 5 powinniśmy otrzymać taki trójkąt:<br />
        * <br />
        ** <br />
        *** <br />
        **** <br />
        ***** <br />
8. Narysuj odbicie lustrzane trójkąta z poprzedniego zadania tj. dla n = 5 powinniśmy ujrzeć:<br />
&nbsp;&nbsp;&nbsp;&nbsp;* <br />
&nbsp;&nbsp;&nbsp;** <br />
&nbsp;&nbsp;*** <br />
&nbsp;**** <br />
***** <br />
9. Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) drzewko choinkowe. Podając n = 5 powinniśmy otrzymać takie drzewko:<br />
 &nbsp;&nbsp;&nbsp;&nbsp;* <br />
 &nbsp;&nbsp;&nbsp;*** <br />
 &nbsp;&nbsp;***** <br />
 &nbsp;******* <br />
 ********* <br />

Package string - treść zadań:
1. Utwórz trzy zmienne typu String. Do pierwszej przypisz swoje imię, do drugiej nazwisko oraz do trzeciej imię i nazwisko oddzielone spacją.
   Następnie wykonaj polecenia używając odpowiednich metod z String i wypisując informacje na ekran:<br />
   a) wypisz ile znaków zawiera zmienna przechowująca imię, ile nazwisko a ile imię i nazwisko<br />
   b) sprawdź czy Twoje imię jest równe "Alicja" lub "Jan"<br />
   c) wypisz nazwisko z WIELKICH LITER<br />
   d) zamień w nazwisku litery 'a' na 'e' i zobacz czy coś się zmieniło<br />
2. Dla zdania "Potrafię coraz więcej z programowania." wypisz każdy znak w osobnej linii.
3. Zdanie „Potrafię coraz więcej z programowania.” napisz od tyłu „.ainawomargorp z jecęiw zaroc ęifartoP”.

Package klasy - treść zadań:<br />
Do każdego zadania utwórz osobny package o nazwie “zadanie1”, “zadanie2”, “zadanie3”, w których będą przechowywane klasy z rozwiązaniami.<br />

1. package "zadanie1": Utwórz klasę o nazwie "Programista", a w niej:<br />
a)&nbsp; pola: imie, nazwisko, jezyk, zarobki<br />
b)&nbsp; metody: pobierzImie(), pobierzNazwisko(), pobierzJezyk(), pobierzWynagrodzenie(), które będą zwracać dane z odpowiednich pól<br />
c)&nbsp; konstruktor, przyjmujący i ustawiający wartości dla wszystkich pól klasy z argumentami: podajImie, podajNazwisko, podajJezyk, podajZarobki<br />
d)&nbsp; pola mają być prywatne a metody i konstruktor publiczne<br />
e)&nbsp; w main: utwórz obiekt z uzupełnionymi danymi i wywołaj metody, wypisując dane na ekran<br /> <br />
2. package "zadanie2": Napisz klasę, która w konstruktorze będzie przyjmować tablicę oraz będzie posiadać cztery metody:<br />
   - zliczającą sumę wszystkich elementów z tablicy 
   - liczącą średnią 
   - znajdującą wartość najmniejszą 
   - znajdującą wartość największą<br />
Każda z metod powinna zwracać wynik jako int.
Utwórz pole przechowujące tablicę. Załóż, że w tablicy będą tylko liczby całkowite.
Pola będą prywatne a metody i konstruktor publiczne.
Klasę, pole i metody nazwij według własnego uznania.
Przetestuj całość w main.
3. package "zadanie3":  Stwórz klasę o nazwie “Matma”. Dodaj w niej metody liczące:<br />
   - obwód i pole koła (jako argument do metody przyjmuje promień koła) 
   - obwód i pole prostokąta (jako argumenty do metody przyjmuje długość boku a i b)<br />
Metody niech będą statyczne i zwracają wynik odpowiedniego typu. Pola i metody niech będą publiczne. 
Utwórz w klasie statyczne, stałe pole, które będzie przechowywać wartość PI = 3.14.
Do obliczeń koła wykorzystaj Twoje PI.

Package zadanie_dziedziczenie, treść zadania:<br />
Utwórz package o nazwie “zadanie_dziedziczenie”, w których będą przechowywane klasy z rozwiązaniami.
1. Utwórz klasę "Osoba" a w niej: 
   - dodaj pola: imię i nazwisko;
   - dodaj konstruktor z argumentami: imię i nazwisko;
   - dodaj metodę "przedstawSie()" która wypisze na ekran “Jestem imie nazwisko" np. "Jestem Jan Kowalski"
2. Utwórz klasę “Pracownik”, która będzie dziedziczyć po klasie “Osoba”, a następnie:
   - dodaj pola do klasy "Pracownik": stanowisko i nazwaFirmy
   - dodaj konstruktor, który będzie ustawiał imię, nazwisko, stanowisko, nazwę firmy. Wykorzystaj konstruktor klasy nadrzędnej do ustawienia imienia i nazwiska
   - przesłoń metodę “przedstawSie()”, aby wypisywała na ekran “Jestem imie nazwisko i pracuję w firmie nazwaFirmy na stanowisku stanowisko”
     np. “Jestem Jan Kowalski i pracuję w firmie XYZ na stanowisku programista”
3. Uzupełnij pola, metody, konstruktory w klasach “Osoba” i “Pracownik” o odpowiednie modyfikatory dostępu.
4. przetestuj klasę Pracownik w main tworząc obiekt i wywołując metodę “przedstawSie()”.
