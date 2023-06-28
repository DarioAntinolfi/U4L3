package lezione3.es1;

public class appMain {
	
	  public static void main(String[] args) {
	    System.out.println("Hello World");
	    

		String str = "Hello World";
		int numeroCaratteri = str.length();
		System.out.println("Numero di caratteri della stringa: " + numeroCaratteri);  
	    
	    int valore = numeroCaratteri % 2;
	    
	    if (valore == 0) {
	    	System.out.println("Pari");
	    } else {
	    	System.out.println("Dispari");
	    }
	  }
	  
	}
