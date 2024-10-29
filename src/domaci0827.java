import java.util.Scanner;

public class domaci0827 {
    public static void main(String[] args) {
    /*
    1. Napisi program koji koristi do-while petlju da omoguci korisniku unos lozinke sve dok ne
    unese ispravnu lozinku. Ispravna lozinka moze biti unapred inicijalozovana.
    */

        Scanner skener = new Scanner(System.in);
        String ispravnaLozinka = "passwOrd123!";
        String unetaLozinka;

        do {
            System.out.println("Unesite lozinku: ");
            unetaLozinka = skener.next();
        } while (!ispravnaLozinka.equals(unetaLozinka));

        System.out.println("Ispravna lozinka! Kraj programa.");


    /*
    2.Napisi program koji koristi while petlju da omogući korisniku unos dva broja. Program
    treba da ispise rezultat deljenja prvog broja sa drugim. Petlja treba da se ponavlja u slucaju
    da je drugi broj jednak nuli. (edited)
     */

        System.out.println("Unesite prvi broj: ");
        int broj1 = skener.nextInt();
        System.out.println("Unesite drugi broj: ");
        int broj2 = skener.nextInt();

        while (broj2 == 0) {
            System.out.println("Nije moguce deljenje sa 0. Unesite ponovo drugi broj: ");
            broj2 = skener.nextInt();
        }

        double rezultat = (double) broj1 / broj2;

        System.out.println("Kolicnik dva broja je: " + rezultat);
    }
}
