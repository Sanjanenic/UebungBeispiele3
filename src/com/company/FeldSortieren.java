package com.company;

import java.util.Arrays;

public class FeldSortieren {
    public static void main(String[] args) {
int [] arr= new int []{8,5,1,9,0,4};
arrangeOrder(arr);

    }

    public static void arrangeOrder(int[] numbers){

        int[] hilfe=new int[3];

        for (int iNr=0; iNr< numbers.length-1; iNr++ ) {

            if(numbers[iNr] > numbers[iNr+1]) {

                hilfe = new int[]{numbers[iNr], numbers[iNr + 1], };
               // numbers[iNr] = hilfe[0];
               // numbers[iNr+1]=hilfe[1];
                System.out.println(Arrays.toString(numbers));
                System.out.println(Arrays.toString(hilfe));
            }


        }

        }
       //

//[0, 5, 1, 9, 0, 4]
//[0, 0, 0]
//[0, 0, 1, 9, 0, 4]
//[0, 0, 0]
//[0, 0, 1, 0, 0, 4]
//[0, 0, 0]

        }

//Schreiben Sie eine Methode mit dem Namen:
//public static void arrangeOrder(int[] numbers) {

//}
//Die Methode soll die Ganzzahlen im Array in eine aufsteigende Reihenfolge bringen. Programmieren
//Sie diese Funktionalität mit folgendem einfachen Verfahren:
//1) Durchlaufen Sie das Array elementweise von links nach rechts.
//2) Vergleichen Sie dabei in jedem Schritt das aktuelle Element mit dem unmittelbar
//nachfolgenden Element (= “mit seinem rechten Nachbar”)
//a. Sofern das aktuelle Element größer ist als sein rechter Nachbar müssen Sie die
//beiden Elemente im Array vertauschen.
//3) Wiederholen Sie den gesamten Vorgang (Schritte 1+2) solange, bis Sie feststellen, dass keine
//Vertauschung mehr nötig war.
//Haben Sie alles richtig gemacht, beinhaltet das Array am Ende die Ganzzahlen in aufsteigender
//Reihenfolge.
//Beispiel:
//[8,5,1,9,0,4] => beinhaltet danach => [0,1,4,5,8,9]
