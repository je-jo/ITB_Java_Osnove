public class domaci0822 {
    public static void main(String[] args) {

// 1. Napisati program koji računa površinu i obim pravougaonika sa zadatim dimenzijama a = 5 i b = 13 (dužine stranica).

        int a = 5;
        int b = 13;
        int povrsina = a * b;
        int obim = 2 * a + 2 * b;
        System.out.println("Povrsina pravougaonika je: " + povrsina);
        System.out.println("Obim pravougaonika je: " + obim);

// 2. String s1 = "bootcamp qa" i s2 = "xx generacija" spojiti u novi string i ispisati ga u konzoli tako da sva slova budu velika.

        String s1 = "bootcamp qa";
        String s2 = "xx generacija";
        String s3 = s1 + " " + s2;
        System.out.println(s3.toUpperCase());

// 3. Inicijalizovati promenljive broj1 i broj2 sa proizvoljnim vrednostima, zatim ispisati rezultate njihovog zbira, proizvoda i ostatka pri deljenju.

        int broj1 = 8;
        int broj2 = 3;
        System.out.println("Zbir brojeva je: " + (broj1 + broj2));
        System.out.println("Proizvod brojeva je: " + broj1 * broj2);
        System.out.println("Ostatak pri deljenju brojeva je: " + broj1 % broj2);

    }
}
