package Ejercicios;

import java.util.Scanner;

public class Ejercicio2S8 {

	public static int hola(int min , int max) {
		return (int)Math.floor(Math.random()*(max-min+1)+min);
		
	}
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner( System.in );
		
		  System.out.printf( "Introduzca un número minimo: " );
		  int num1 = keyboard.nextInt();
		  System.out.printf( "Introduzca un número maximo: " );
		  int num2 = keyboard.nextInt();

		
		  System.out.println(hola(num1,num2));
	}

}
