package com.company;

import java.util.Arrays;

public class FlatArray {
    public static void main(String[] args) {

    int []flat= getFlatArray(new int[][]{{1,2,3,4},{5,6,7,8}});
        System.out.println(Arrays.toString(flat));
    }
    public static int[] getFlatArray(int[][] numbers){

        int []flat=new int[numbers.length*numbers[0].length];
        int zahler=0;

       for(int index=0; index<numbers.length;index++){
          for(int indexHorisontal=0; indexHorisontal<numbers[index].length; ++indexHorisontal){
              flat[zahler]= numbers[index][indexHorisontal];
              zahler++;
          }
       }return flat;
    }

}

///[[0, 1, 9],
//// [6, 3, 2]] => [0, 1, 9, 6, 3, 2]
//Erstellen Sie eine neue Klasse namens NumberHelper. Legen Sie in dieser Klasse eine statische
//Methode mit folgender Signatur:
//public static int[] getFlatArray(int[][] numbers) {

//Die Methode soll die Ganzzahlen aus dem 2d-Array (enthält nur positive Zahlen) in einem flachen,
//eindimensionalen Array abbilden.
//Beispiel:
//Input Output

//Erweitern Sie dieses Beispiel, sodass jede Zahl nur maximal einmal vorkommen soll, dh. doppelte
//Zahlen sind auszusortieren. Initialisieren Sie das Rückgabe-Array zuerst mit „-1“ Werten, sodass Sie
//später erkennen, wenn einzelne Plätze nicht belegt wurden.
//Beispiel:
//Input Output
//[[3, 5, 8], [4, 5, 6]] => [3, 5, 8, 4, 6, -1] (die doppelte 5 wurde aussortiert, der letzte Platz
//bleibt somit leer und beinhaltet folglich den Initialwert -1).