package hu.petrik.BejegyzesProjekt;

import java.util.ArrayList;
import java.util.List;
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
        int beker = Integer.parseInt(sc.nextLine());
        int i = 0;
        while(beker-1 > i) {
            try {
                System.out.print("Adja meg a bejegyzés szerzőjét: ");
                String bekert = sc.nextLine();
                System.out.print("Adja meg a bejegyzés tartalmát: ");
                String bekert2 = sc.nextLine();
                bejegyzes = new Bejegyzes(bekert,bekert2);
                lista.add(bejegyzes);

            }
            catch (NumberFormatException e) {
                System.err.println("Nem pozitív egész számot adott meg");
            }

            i++;
        }


    }
}
