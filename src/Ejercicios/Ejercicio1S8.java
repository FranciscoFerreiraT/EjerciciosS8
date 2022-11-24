package Ejercicios;

import java.util.Scanner;

public class Ejercicio1S8 {

    public static void array () {



        Scanner keyboard = new Scanner( System.in );




        int [] hola = new int[4];

        for(int i= 0;i<hola.length ;i++) {
             System.out.printf( "Introduzca un número: " );
               hola[i] = keyboard.nextInt();

        }
        array2(hola);
    }

    public static void array2 (int hola[]) {

        for(int i= 0;i<hola.length ;i++) {
            System.out.println( i + " " + hola[i] );


       }
    }

    public static void main(String[] args) {

        array();

    }
}
