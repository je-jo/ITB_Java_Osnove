public class Bingo {
    public static void main(String[] args) {
        /*
        Projekat:
        Bingo Projekat
        Napraviti program koji se sastoji od tri metode:
        -unesiBrojeve() -> metoda vraca niz od 6 brojeva, to mogu biti brojevi
        koji su odmah definisani, ubaceni preko skenera ili ubaceno preko Math.random().
        Ovih 6 brojeva ce biti brojevi koji ce korisnik pogadjati.
        -generisi() -> vraca nam niz od 30 nasumnicnih brojeva(nije bitno ako ima duplikata).
        -bingo(int[] niz1,int[] niz2) -> prethodno dva izgenerisana niza proslednjujemo ovoj metodi i proveravamo
        Koliko se nashi brojeva nalazi u izgenerisanom nizu, ispisati poruku ako korisnik pogodi bingo!
        **Ukoliko ima potrebe za neke modifikacije metoda u smislu da dodate nesto, napravite pomocnu metodu i to,
        to je sve dozvoljno
         */

        int[] korisnickiBrojevi = unesiBrojeve();
        int[] generisaniBrojevi = generisi();

        stampajNiz(korisnickiBrojevi);
        stampajNiz(generisaniBrojevi);
        bingo(korisnickiBrojevi, generisaniBrojevi);

    }

    public static int[] unesiBrojeve() {
        int[] korisnickiBrojevi = new int[6];
        for (int i = 0; i < korisnickiBrojevi.length; i++) {
            int randomBroj = (int) ((Math.random() * 100) + 1);
            korisnickiBrojevi[i] = randomBroj;
        }
        return korisnickiBrojevi;
    }

    public static int[] generisi() {
        int[] generisaniBrojevi = new int[30];
        for (int i = 0; i < generisaniBrojevi.length; i++) {
            int randomBroj = (int) ((Math.random() * 100) + 1);
            generisaniBrojevi[i] = randomBroj;
        }
        return generisaniBrojevi;
    }

    public static void bingo(int[] niz1, int[] niz2) {
        int brojac = 0;
        for (int i = 0; i < niz1.length; i++) {
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i] == niz2[j]) {
                    brojac++;
                }
            }
        }
        System.out.println("Broj pogodaka je " + brojac);
        if (brojac == 6) {
            System.out.println("BINGO!");
        }
    }

    public static void stampajNiz(int[] niz) {
        System.out.println("Elementi niza su: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " | ");
        }
        System.out.println();
    }
}
