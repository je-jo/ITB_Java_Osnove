import java.util.Scanner;

public class domaci0826 {
    public static void main(String[] args) {

        /*
        1. Napisi program koji korisnika pita da unese ocenu ucenika kao celobrojni broj (na primer, 5, 4, 3, 2, 1).
        Koristiti switch za konvertovanje ocenu u slovnu ocenu prema sledećem kljucu:
        Ako je ocena 5, slovna ocena je "Odlican".
        Ako je ocena 4, slovna ocena je "Vrlo dobar".
        Ako je ocena 3, slovna ocena je "Dobar".
        Ako je ocena 2, slovna ocena je "Dovoljan".
        Ako je ocena 1, slovna ocena je "Nedovoljan".

        */

        Scanner skener = new Scanner(System.in);

        System.out.println("Unesite ocenu od 1-5: ");
        int ocena = skener.nextInt();
        String slovnaOcena = "Bez ocene";
        switch (ocena) {
            case 5: {
                slovnaOcena = "Odlican";
                break;
            }
            case 4: {
                slovnaOcena = "Vrlo dobar";
                break;
            }
            case 3: {
                slovnaOcena = "Dobar";
                break;
            }
            case 2: {
                slovnaOcena = "Dovoljan";
                break;
            }
            case 1: {
                slovnaOcena = "Nedovoljan";
                break;
            }
            default: {
                System.out.println("Uneli ste pogresnu ocenu, pokusajte ponovo.");
            }
        }
        System.out.println("Ocena ucenika: " + slovnaOcena + ".");

        /*
        2. Napisi program koji koristi for petlju da proveri da li je broj N prost.
        Korisnik treba da unese vrednost N, a program treba da ispita da li je taj broj deljiv samo sa 1 i sa samim sobom.
        Ispiši odgovarajuću poruku.
         */

        System.out.println("Unesite broj: ");
        int N = skener.nextInt();
        boolean daLiJeBrojProst = true;


        while (N == 1) {
            System.out.println("1 nije prost broj. Unesite drugi broj: ");
            N = skener.nextInt();
        }

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                daLiJeBrojProst = false;
                break;
            }
        }


        if (daLiJeBrojProst) {
            System.out.println("Broj " + N + " je prost broj jer je deljiv samo sa 1 i sa samim sobom.");
        } else {
            System.out.println("Broj " + N + " nije prost broj, jer je, osim sa samim sobom i sa 1, deljiv i sa drugim brojevima.");
        }

    }
}
