package org.java.lessons.flottaveicoli;

import java.time.LocalDate;

public class Automobile extends Veicolo {
    //ATTRIBUTI
        private int numPorte;

    //COSTRUTTORI

    public Automobile(int targa, LocalDate annoImmatricolazione, int numPorte) {
        super(targa, annoImmatricolazione);
        this.numPorte = numPorte;
    }

    //GETTER SETTER

    //METODI
}
