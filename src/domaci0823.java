import java.util.Scanner;

public class domaci0823 {
    public static void main(String[] args) {

        // 1. Napisati program koji izracunava povrsinu i obim kruga za radijus r. (2 * r * PI)

        Scanner skenerR = new Scanner(System.in);
        System.out.println("Unesite poluprecnik kruga: ");
        int r = skenerR.nextInt();
        System.out.println("Uneli ste poluprecnik: " + r);
        double povrsina = Math.pow(r, 2) * Math.PI;
        double obim = 2 * r * Math.PI;
        System.out.println("Obim kruga sa poluprecnikom " + r + " je " + obim + ", a povrsina je " + povrsina + ".");

        /*
        2. Napisati progam koji za uneti broj poena (0-100) dodeljuje odgovarajucu ocenu (6, 7, 8, 9, 10) prema sledecem ranigiranju
        51-60
        61-70
        71-80
        81-90
        91-100
        Ako je broj poena manji od 51, ispisati poruku da je broj bodova nedovoljan za polaganje ispita.
         */

        Scanner skenerP = new Scanner(System.in);
        System.out.println("Unesite broj poena (0-100): ");
        int poeni = skenerP.nextInt();
        if (poeni >= 0 && poeni < 51) {
            System.out.println("Nemate dovoljan broj bodova za polaganje ispita.");
        } else if (poeni >= 51 && poeni <= 60) {
            System.out.println("Vasa ocena je 6.");
        } else if (poeni >= 61 && poeni <= 70) {
            System.out.println("Vasa ocena je 7.");
        } else if (poeni >= 71 && poeni <= 80) {
            System.out.println("Vasa ocena je 8.");
        } else if (poeni >= 81 && poeni <= 90) {
            System.out.println("Vasa ocena je 9.");
        } else if (poeni >= 91 && poeni <= 100) {
            System.out.println("Vasa ocena je 10.");
        } else {
            System.out.println("Pogresan unos. Potrebno je uneti broj od 0-100.");
        }

        /*
         3. Napisi jednostavan kalkulator koji trazi od korisnika da unese dva broja i operaciju (+ ili -).
         Na osnovu izbora korisnika, program treba da izvrsi odgovarajucu operaciju.
         (char operacija = sc.next().charAt(0); -> za ucitavanje znaka)
         */

        Scanner skenerK = new Scanner(System.in);
        System.out.println("Unesite dva cela broja (sa razmakom izmedju): ");
        int x = skenerK.nextInt();
        int y = skenerK.nextInt();
        System.out.println("Unesite operaciju (+ ili -): ");
        char operacija = skenerK.next().charAt(0);
        if (operacija == '+') {
            System.out.println("Zbir brojeva " + x + " i " + y + " je " + (x + y) + ".");
        } else if (operacija == '-') {
            System.out.println("Razlika brojeva " + x + " i " + y + " je " + (x - y) + ".");
        } else {
            System.out.println("Pogresan unos operacije. Potrebno uneti + ili -.");
        }

    }
}
