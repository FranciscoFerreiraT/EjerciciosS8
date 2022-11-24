package Ejercicios;

import java.util.Scanner;

public class Ejercicio3S8 {

	public static int[] array (int num,int max,int min) {
		
		   int [] hola = new int[num];
		   for(int i= 0;i<hola.length ;i++) {
			   
			   hola[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
			   
		   }
		   return hola;
	}	
	
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner( System.in );
		
		  System.out.printf( "Introduzca la longitud: " );
		  int num1 = keyboard.nextInt();
		  System.out.printf( "Introduzca un número maximo: " );
		  int num2 = keyboard.nextInt();
		  System.out.printf( "Introduzca un número minimo: " );
		  int num3 = keyboard.nextInt();
	
		  int [] adios = array(num1,num2,num3);

		  for(int i= 0;i<adios.length ;i++) {
			   
			  System.out.println(adios[i]);
			   
		   }
	}

}
