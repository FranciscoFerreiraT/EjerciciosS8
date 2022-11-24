package Ejercicios;
import java.util.Scanner;
public class Ejercicio5S8 {
	
	public static void juego () {
		
		 Scanner keyboard = new Scanner( System.in );
		 
		int max = 10;
		int min = 1;
		
		
		int numram = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		 for(int i= 0;i<10 ;i++) {
			   
			 System.out.printf( "Intenta adivinar el numero: " );
			  int num = keyboard.nextInt();
			  if(numram == num) {
				  System.out.printf( "Has ganado " );
				  return;
			  }else if(numram > num) {
				  System.out.printf( " Fallaste el numero es mayor " );
			  }else if(numram < num) {
				  System.out.printf( " Fallaste el numero es menor " );
			  }
			 
		 }
		
	}
	

	public static void main(String[] args) {
		juego();
	}

}