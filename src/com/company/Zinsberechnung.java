package com.company;

public class Zinsberechnung {
    public static void main(String[] args) {

        //double kontostand=1000.00;
       // double zinsen = 0.0225;    // 2.25% = 2.25/100 = 0.0225 ovo nam treba za racunanje kameate na kraju zadanog iznosa
        //int jahr =1;
        //double ZinseAmEndeLaufzeit=kontostand*zinsen*jahr;  //formula za kamatu je iznos*kamatna stopa*vrijeme u godinama

        System.out.println("Ihre erhaltene Zinsen sind " +ZinseAmEndeLaufzeit(1000,0.0225,1));
        System.out.println("Ihre erhaltene Zinsen sind " +ZinseAmEndeLaufzeit(1000,0.0225,2));
        System.out.println("Ihre erhaltene Zinsen sind " +ZinseAmEndeLaufzeit(1000,0.0225,3));

    }
    public static double ZinseAmEndeLaufzeit (double kontostand, double zinsen, int jahr ){
        double ergebnis= kontostand*zinsen*jahr;
        return ergebnis;
    }

}

//Beispiel 1 – Zinsberechnung
      //  Erstellen Sie eine neue Klasse mit dem Namen „ZinsDemo“. Deklarieren Sie eine Variable kontostand
       // und zinsen. Initialisieren Sie diese Variablen mit geeigneten Werten (zB.: kontostand = 1000 | zinsen
      //  = 2,25). Berechnen Sie die erhaltenen Zinsen am Ende der Laufzeit und geben Sie den errechneten
       // Wert auf der Konsole aus.
       // Zinsen = 2,25 % von 1000 = 25

//Primjer 1 - Obračun kamata
//Napravite novu klasu pod nazivom InterestDemo. Deklarirajte varijabilno stanje
//i kamata. Inicijalizirajte ove varijable odgovarajućim vrijednostima (npr.: stanje = 1000 | kamata
//= 2,25). Izračunajte kamatu primljenu na kraju roka i unesite obračunate
//vrijednost na konzoli.
//Kamata = 2,25% od 1000 = 25