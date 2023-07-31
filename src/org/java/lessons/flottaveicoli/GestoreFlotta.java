package org.java.lessons.flottaveicoli;
/*La classe GestoreFlotta deve permettere di:
        _Aggiungere nuovi veicoli alla flotta
        _Contare quanti veicoli ci sono di un determinato tipo (automobile o motocicletta)
        _Trovare un veicolo specifico tramite il numero di targa */
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class GestoreFlotta {
    public static void main(String[] args) {
        //HashMap<Automobile> myList = new HashMap<Automobile>();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!false) {
            System.out.println("Benvenuto! Per favore scegliere cosa vuole inserire 1-Automobile oppure 2-Motocicletta");
            String choice = scan.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Inserisca la targa del suo veicolo: ");
                    int targaAuto = scan.nextInt();
                    System.out.println("Inserisca l'anno d'immatricolazione del suo veicolo: (yyyy-mm-dd) ");
                    LocalDate annoImmatricoAuto = LocalDate.parse(scan.nextLine());

                    System.out.println("Inserisca il numero di porte:");
                    int door = scan.nextInt();

                    Automobile veicolo = new Automobile(targaAuto, annoImmatricoAuto, door);

                    break;
                case "2":
                    System.out.println("Inserisca la targa del suo veicolo: ");
                    int targaMoto = scan.nextInt();
                    System.out.println("Inserisca l'anno d'immatricolazione del suo veicolo: (yyyy-mm-dd) ");
                    LocalDate annoImmatricoMoto = LocalDate.parse(scan.nextLine());



                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }


    }
}
