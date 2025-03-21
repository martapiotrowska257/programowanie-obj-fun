package pojava.lab2a.zadB;

import java.util.Arrays;

public class TablicaZeStringami {
    public static void main(String[] args) {

        if (args.length < 4) {
            System.out.println("Error: Podaj 4 argumenty!");
            return;
        }

        String[] array = new String[4];
        for (int i = 0; i < 4; i++) {
            array[i] = args[i];
        }

        System.out.println(Arrays.toString(array));
    }
}