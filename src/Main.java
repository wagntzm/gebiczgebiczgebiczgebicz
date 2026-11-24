import java.util.Random;
import java.util.Scanner;

public class Main {


    static void wypelnij(int[] tab, int n) {
        Random los = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = los.nextInt(100) + 1;
        }
    }

    static int szukaj(int[] tab, int n, int szukana) {
        tab[n] = szukana;
        int i = 0;
        while (tab[i] != szukana) {
            i++;
        }
        if (i == n) {
            return -1;
        }
        return i;
    }

    public static void main(String[] args) {
        int n = 50;
        int[] tab = new int[n + 1];

        wypelnij(tab, n);

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę do wyszukania: ");
        int szukana = sc.nextInt();

        int wynik = szukaj(tab, n, szukana);

        System.out.print("Tablica: ");
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        if (wynik == -1) {
            System.out.println("Nie ma takiej liczby w tablicy.");
        } else {
            System.out.println("Liczba znaleziona pod indeksem: " + wynik);
        }
    }
}