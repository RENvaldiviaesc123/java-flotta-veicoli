package org.java.lessons.flottaveicoli;

import java.time.LocalDate;

public class Motocicletta extends Veicolo {
    //ATTRIBUTI
        private boolean cavalletto;

    //COSTRUTTORI

    public Motocicletta(int targa, LocalDate annoImmatricolazione, boolean cavalletto) {
        super(targa, annoImmatricolazione);
        this.cavalletto = cavalletto;
    }

    //GETTER SETTER

    //METODI
}
