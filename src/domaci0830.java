import java.util.Scanner;

public class domaci0830 {
    public static void main(String[] args) {

        Scanner skener = new Scanner(System.in);

        System.out.println("Unesite broj za izracunavanje kvadrata, korena i faktorijela: ");
        int x = skener.nextInt();

        ispisiKvadrat(x);
        ispisiKoren(x);
        System.out.println("Faktorijel unetog broja je: " + izracunajFaktorijel(x) + ".");
    }

    // 3. Napisati program koji koristi metode za ispisivanje kvadrata i korena unetog broja.

    public static void ispisiKvadrat(int unetiBroj) {
        System.out.println(unetiBroj + " na kvadrat je: " + unetiBroj * unetiBroj + ".");
    }

    public static void ispisiKoren(int unetiBroj) {
        System.out.println("Kvadratni koren od " + unetiBroj + " je: " + Math.sqrt(unetiBroj));
    }

    // 4. Napisati program koji koristi metodu za izracunavanje faktorijela unetog broja.

    public static int izracunajFaktorijel(int unetiBroj) {
        int brojac = 1;
        int faktorijel = 1;
        while (brojac <= unetiBroj) {
            faktorijel *= brojac;
            brojac++;
        }
        return faktorijel;
    }

}
