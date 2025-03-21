package pojava.lab1.zadC;

import java.util.Random;

public class Taxi extends Auto {
    private float[] zarobki;

    public Taxi() {
        super(); // wywołanie konstruktora `Auto`
        zarobki = new float[12];
        Random rand = new Random();
        for (int i = 0; i < 12; i++) {
            zarobki[i] = 3000 + rand.nextFloat() * 5000; // losowe zarobki 3000-8000 zł
        }
    }

    public float srZarobki() {
        float suma = 0;
        for (float zarobek : zarobki) {
            suma += zarobek;
        }
        return suma / zarobki.length;
    }

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        System.out.println("Średni przebieg: " + taxi.srPrzebieg() + " km");
        System.out.println("Średnie zarobki: " + taxi.srZarobki() + " zł");
    }
}
