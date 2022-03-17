package com.company;

public class GroßBuchstaben {
    public static void main(String[] args) {


        System.out.println(grossErsteBuchsstabenmachen("la vitta e bella!"));
    }
    public static String grossErsteBuchsstabenmachen(String original){

        String helper=new String();
        char c = ' ';
        for(int i =0; i<original.length();++i ){

            c =original.charAt(i);
            if((i == 0) ||(i>0 && original.charAt(i-1)==' ' )){
                c=Character.toUpperCase(original.charAt(i));
            }

             helper= helper+c;
        }
        return (helper);
    }

}



//Die Methode length() liefert bei einem String-Datentyp die Anzahl der Zeichen.
//"abcd".length() liefert 4
// Character.toUpperCase(arg0) liefert den Großbuchstaben zu einem Zeichen
// Die Methode .charAt(index) liefert bei einem String das Zeichen (Datentyp char) an der
//Position index "abcd".charAt(2) liefert ein „c“
// Ein char kann mit einem Plus (+) – Zeichen mit einem String verkettet werden