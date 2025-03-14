package pojava.lab1.zadB;
import java.util.Arrays; // import potrzebny do wyswietlenia tablicy


public class TablicaStringow {
    public static void main(String[] args) {

        // sprawdzamy, czy podano dokładnie 4 argumenty
        if (args.length < 4) {
            System.out.println("Error: Podaj 4 słowa jako argumenty!");
            return;
        }

        // tworzymy tablicę i przypisujemy do niej argumenty
        String[] slowa = new String[4];
        for (int i = 0; i < 4; i++) {
            slowa[i] = args[i];
        }

        System.out.println("Podane słowa: " + Arrays.toString(slowa));
    }
}
