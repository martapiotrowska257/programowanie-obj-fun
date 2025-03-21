package pojava.lab2a.zadA;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Witaj!");

        // sprawdzamy czy podano argument
        if (args.length == 0) {
            System.out.println("Error: Podaj argument!");
            return;
        }

        // wypisujemy liczby od 1 do 20
        // int x = 20;

        // zmiana argumentu x na liczbę
        int x = Integer.parseInt(args[0]);

        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }
}