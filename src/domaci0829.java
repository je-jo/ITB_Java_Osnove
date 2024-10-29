import java.util.Scanner;

public class domaci0829 {
    public static void main(String[] args) {

        // 1. Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca sumu svih elemenata niza

        Scanner skener = new Scanner(System.in);

        int[] nizSuma = new int[5];
        int suma = 0;

        System.out.println("Unesite 5 brojeva za izracunavanje zbira: ");

        for (int i = 0; i < nizSuma.length; i++) {
            System.out.println("Unesite " + (i + 1) + ". broj:");
            nizSuma[i] = skener.nextInt();
            suma += nizSuma[i];
        }

        System.out.println("Zbir 5 unetih brojeva je: " + suma + ".");

        // 2. Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca maksimalni element u nizu

        System.out.println("Unesite 5 brojeva za nalazenje maksimuma: ");

        int[] nizMax = new int[5];


        for (int i = 0; i < nizMax.length; i++) {
            System.out.println("Unesite " + (i + 1) + ". broj:");
            nizMax[i] = skener.nextInt();
        }

        int max = nizMax[0];

        for (int i = 0; i < nizMax.length - 1; i++) {
            if (Math.max(nizMax[i], nizMax[i + 1]) > max) {
                max = Math.max(nizMax[i], nizMax[i + 1]);
            }
        }

        System.out.println("Najveci uneti broj je: " + max + ".");

    }
}
