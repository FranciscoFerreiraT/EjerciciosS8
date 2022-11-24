package Ejercicios;
import java.util.Scanner;
public class Ejercicio6S8 {
	
	public static void juego () {
		
		 Scanner keyboard = new Scanner( System.in );
		 
		int max = 100;
		int min = 1;
		
		
		int numram = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		 for(int i= 1;i<6 ;i++) {
			   
			 System.out.printf( "Intenta adivinar el numero: " );
			  int num = keyboard.nextInt();
			  if(numram == num) {
				  System.out.printf( "Has ganado " );
				  return;
			  }else if(numram > num) {
				  System.out.printf( "  Fallaste el numero es mayor  " );
				  System.out.printf( "Llevas " + i + "  Intentos de 5  " );
			  }else if(numram < num) {
				  System.out.printf( "  Fallaste el numero es menor  " );
				  System.out.printf( "Llevas " + i + "  Intentos de 5  " );
			  }
			 
		 }
		
	}
	

	public static void main(String[] args) {
		juego();
	}

}