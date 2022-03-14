package com.company;

public class FizzBuzz {


    public static void main(String[] args) {

        for(int i=1; i<=100; ++i){
            if ((i%3==0)&&(i%5==0)){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }

        //public static String ZahlToString(int zahl){   //ne ide dalje, ne znam kako



        }
    }


//Für die Zahlen 1 bis 100:
//a.) Wenn die Zahl durch 3 teilbar ist, wird 'Fizz' ausgegeben.
//b.) Wenn die Zahl durch 5 teilbar ist, wird 'Buzz' ausgegeben.
//c.) Ist die Zahl durch beides teilbar, soll 'FizzBuzz' ausgegeben werden.
//d.) In allen anderen Fällen soll einfach die Zahl selbst ausgegeben werden.
//Tipp: Der Modulo-Operator % könnte hilfreich sein ;)
//Bonus:
//• Schreibe eine Methode, welche eine Zahl übernimmt und als Ergebnis den richtigen
//String zurückgibt.
//• Schreibe eine Methode, welche diese Methode benutzt um für alle Zahlen von 1 bis 100
//den passenden String in einem Array (Feld) speichert.
//• Schreibe eine Methode welche ein String[] übernimmt und alle darin gespeicherten
//Strings in einzelnen Zeilen in der Konsole ausgibt.
//• Gestalte die main-Methode so, dass die Lösung des FizzBuzz-Beispiels am Bildschirm
//erscheint, wenn man das Programm ausführt.