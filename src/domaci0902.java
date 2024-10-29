import java.util.Scanner;

public class domaci0902 {

    public static void main(String[] args) {

        Scanner skener = new Scanner(System.in);

        System.out.println("Unesite duzinu niza: ");
        int duzina = skener.nextInt();

        int[] niz = unesiNiz(duzina, skener);
        stampajNiz(niz);
        System.out.println("Srednja vrednost unetog niza je: " + izracunajSrednjuVrednost(niz));;
        System.out.println("Zbir dvocifrenih brojeva u nizu je: " + izracunajZbirDvocifrenihBrojeva(niz));
        System.out.println("Razlika izmedju minimalnog i maksimalnog elementa niza je: " + izracunajRazlikuMinMaxElementa(niz));

    }

    /*
    Domaci
    1. Napisati program koji omogucava korisniku da unese niz celih brojeva. Program treba da ima sledeće metode:
    */

    // - Metoda za unos niza

    public static int[] unesiNiz(int duzina, Scanner skener) {
        System.out.println("Unesite elemente niza: ");
        int[] niz = new int[duzina];
        for (int i = 0; i < duzina; i++) {
            niz[i] = skener.nextInt();
        }
        System.out.println("Svi elementi niza su uneti.");
        return niz;
    }

    // - Metoda za stampanje niza

    public static void stampajNiz(int[] niz) {
        System.out.println("Elementi niza su: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }

    // - Metoda za racunanje srednje vredsnoti brojeva u nizu

    public static double izracunajSrednjuVrednost(int[] niz) {
        int zbir = 0;
        for (int i = 0; i < niz.length; i++) {
            zbir += niz[i];
        }
        double srednjaVrednost = zbir / niz.length;
        return srednjaVrednost;
    }

    // - Metoda za sabiranje svih dvocifrenih brojeva

    public static int izracunajZbirDvocifrenihBrojeva(int[] niz) {
        int zbirDvocifrenih = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > 9 && niz[i] < 100) {
                zbirDvocifrenih += niz[i];
            }
        }
        return zbirDvocifrenih;
    }

    // - Metoda za vracanje razlike izmedju minimalnog i maksimalnog elementa niza

    public static int izracunajRazlikuMinMaxElementa(int[] niz) {
        int min = niz[0];
        int max = niz[0];
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < min) {
                min = niz[i];
            }
        }
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
        }
        int razlika = max - min;
        return razlika;
    }
}
