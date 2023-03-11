import java.util.Random;
import java.util.Scanner;

/**
 * Gra polega na tym że:
 * 1. Gra losuje liczbe losową 1-100
 * 2. Gracz podaje liczbę
 * 3. Gra informuje czy podana liczba jest mniejsza, większa czy taka sama jak wylosowana
 *      - Jeżeli jest mniejsza lub większa program znowu pyta użytkownika o podanie jakiejś liczby
 *          (gracz już wie że jest większa lub mniejsza niż wcześniej podana)
 *      - Jeżeli jest taka sama program się kończy i wyświetla gratulacje
 *
 *   Dodatkowe wyzwania (zanim je zaczniesz pogadamy o tym jak rozwiązałeś główne zadanie)
 *   1. Wyświetl na koniec gry liczbę prób zgadnięcia wylosowanej liczby
 *   2. Dodaj tryb gry dla dwóch graczy pierwsze jeden do zgadnięcia pózniej drugi do zgadnięcia innej liczby i wyświetlenie
 *          na koniec statystyk dla obu
 *   2. Zmień tryb gry dla dwóch graczy - tak żeby gracze zgadywali tą samą liczbe na przemian
 *
 *
 *   Ode mnie: Dodatkowe 2 i 3 to są wymyślone przeze mnie teraz nie mam pewności jak trudne mogą być więc możemy razem wtedy porobić
 *
 */

public class Main {

    // W METODZIE MAIN NIC NIE ZMIENIASZ
    public static void main(String[] args) {

        //Ten obiekt posiada metodę która służy do tworzenia losowej liczby
        Random random = new Random();

        // Ta zmienna przedstawia losową liczbę w zakresie 1 - 100
        final int losowaLiczba = random.nextInt(100) + 1;

        gra(losowaLiczba);
    }

    // Kod który dodałem w tej metodzie jest tylko już moimi podpowiedziami, możesz edytować co chcesz
    static void gra(int losowaLiczba) {

        // Ten obiekt posiada metodę .nextInt() służącą do wprowadzania danych od uzytkownaika
        Scanner scanner = new Scanner(System.in);

        // Do tej zmiennej będziesz przypisywał wybory użytkownika
        int wybranaLiczba;

        // Ta zmienna służy do wyjścia z pętli while w momencie znalezienia prawidłowej liczby
        boolean znalezionoLiczbe = false;

        // Nie wiem czy znasz Scannera więc też dodałem linijke w której użytkownik podaje swoją liczbę


        System.out.println("Witam w programie! W tej grze będziesz starać się odgadnąć liczbę z zakresu 1 - 100");



        System.out.println("Wprowadź swoją liczbę: ");

        // W tym momencie użytkownik wpisuje liczbę
        wybranaLiczba = scanner.nextInt();


        System.out.println("Koniec programu");
    }
}