package hu.petrik.BejegyzesProjekt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Bejegyzes> lista = new ArrayList<>();
	    Bejegyzes bejegyzes = new Bejegyzes("Troll tanár","Idén egy vizsgaremeket sem fogok átengedni, " +
                "hogy mindenkinek ősszel kelljen vizsgáznia.");
        lista.add(bejegyzes);
        bejegyzes = new Bejegyzes("Junior fejlesztö","Azt hiszi, hogy programozni fog, de " +
                "valójában bugfixál, és oktatási felületről tanul.");
        lista.add(bejegyzes);

        Scanner sc = new Scanner(System.in);
        System.out.println("Hány bejegyzést szeretnél felvenni?");
        int beker = 0;
        try {
            beker = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException e) {
            System.err.println("Nem pozitív egész számot adott meg!");
        }
        int i = 0;
        while(beker > i) {
            try {
                System.out.print("Adja meg a bejegyzés szerzőjét: ");
                String bekert = sc.nextLine();
                System.out.print("Adja meg a bejegyzés tartalmát: ");
                String bekert2 = sc.nextLine();
                bejegyzes = new Bejegyzes(bekert,bekert2);
                lista.add(bejegyzes);

            }
            catch (NumberFormatException e) {

            }

            i++;
        }

        File fajl = new File("bejegyzesek.csv");
        Scanner fajlbeolvas = new Scanner("");
        try {
            fajl = new File("bejegyzesek.csv");
            fajlbeolvas = new Scanner(fajl);

        }
        catch (FileNotFoundException e) {

        }

        while(fajlbeolvas.hasNext()) {
            String[] beolvas = fajlbeolvas.nextLine().split(";");
            bejegyzes = new Bejegyzes(beolvas[0],beolvas[1]);
            lista.add(bejegyzes);


        }

        Random rnd = new Random();
        long seged = lista.stream().count()*20;
        for (int b = 0; b < seged; b++) {
            bejegyzes.like();
        }


    }
}
