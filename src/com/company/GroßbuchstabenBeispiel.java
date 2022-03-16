package com.company;

public class GroßbuchstabenBeispiel {
    public static void main(String[] args) {


        System.out.println( BuchstabenGrossMachen("Wörter starten immer gut!   ")); //ovo vraca veliklo pocetno samo ako napisem pravilno, sa po jednim razmakom izmedju rijeci
    }


    public static String BuchstabenGrossMachen(String s){  //string je array karaktera, tako se ponasa

       String s2="";             //pomocni string koji se na kraju metode vraca
        for(int i =0; i<s.length();i++){

            if(s.charAt(i) == ' ') {     //kad naidje na " " upise razmak i poveca sljedece slovo (i+1)
                s2+=" ";

                if(i+1>=s.length()){ //ova if petlja sluzi da radi i ako imam a kraju prazna mjesta, radi i bez nje ako napisem pravilno sve gore
                    return s2;
                }
                s2 += Character.toUpperCase(s.charAt(i+1));//povecava sljedece slovo

               i++;    //ovo sluzi da preskoci sledeci karakter, bez njega bi pisao duplo svaki koji poveca
            }

            else{
                s2+=s.charAt(i);
            }
        }
        return s2;
    }
}

//Wörter starten mit Großbuchstaben
//Schreiben Sie eine neue Anwendung, welche in einem String Buchstaben nach einem Leerzeichen in
//Großbuchstaben umwandelt. Implementieren Sie diese Funktionalität in einer Methode mit
//Parameter und Rückgabewert.
//Parameter: „Wörter starten mit Großbuchstaben“
//Rückgabewert: „Wörter Starten Mit Großbuchstaben“
//Tipp:
// Die Methode length() liefert bei einem String-Datentyp die Anzahl der Zeichen.
//"abcd".length() liefert 4
// Character.toUpperCase(arg0) liefert den Großbuchstaben zu einem Zeichen
// Die Methode .charAt(index) liefert bei einem String das Zeichen (Datentyp char) an der
//Position index "abcd".charAt(2) liefert ein „c“
// Ein char kann mit einem Plus (+) – Zeichen mit einem String verkettet werden