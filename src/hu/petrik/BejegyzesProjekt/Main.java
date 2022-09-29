package hu.petrik.BejegyzesProjekt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Bejegyzes bejegyzes = new Bejegyzes("Troll tanár","Idén egy vizsgaremeket sem fogok átengedni, " +
                "hogy mindenkinek ősszel kelljen vizsgáznia.");
        Bejegyzes bejegyzes2 = new Bejegyzes("Junior fejlesztö","Azt hiszi, hogy programozni fog, de " +
                "valójában bugfixál, és oktatási felületről tanul.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Hány bejegyzést szeretnél felvenni?");
        int beker = Integer.parseInt(sc.nextLine());

    }
}
