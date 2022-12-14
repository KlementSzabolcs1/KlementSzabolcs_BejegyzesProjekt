package hu.petrik.BejegyzesProjekt;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bejegyzes {

        private String szerzo;
        private String tartalom;
        private int likeok;
        private LocalDateTime letrejott;
        private LocalDateTime szerkesztve;







    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
        this.szerkesztve = LocalDateTime.now();
    }

    public Integer getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void like() {
        likeok++;

    }


    @Override
    public String toString() {
        DateTimeFormatter datum = DateTimeFormatter.ofPattern
                ("yyyy-MM-dd HH:mm:ss");
        return szerzo + " - " + likeok + " - " + letrejott.format(datum)
                + "\nSzerkesztve: " + szerkesztve.format(datum) + "\n"
                + tartalom + "\n";

    }
}
