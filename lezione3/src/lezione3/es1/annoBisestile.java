package lezione3.es1;

import java.util.Scanner;

public class annoBisestile {
	public static void main(String[] args) {
		  System.out.println("inserisci anno");
		  Scanner anno = new Scanner(System.in);
		  int valore = anno.nextInt();
		  anno.close();
		  if (valore % 4 == 0) {
			  if(valore % 100 == 0 && valore % 400 != 0) {
				  System.out.println("bisestile");
			  } else {
				  System.out.println("bisestile");
			  }
			  
		  } else {
			  System.out.println("non bisestile");
		  }
		  
		}
}
