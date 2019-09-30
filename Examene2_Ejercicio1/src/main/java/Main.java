package main.java;

import java.awt.List;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;


public class Main {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Numero prrimo  de sheldon");
		System.out.println("En el episodio número 73 de la serie “The Big Bang Theory”, Sheldon Cooper enuncia lo siguiente:");
		System.out.println("«El mejor número es el 73. El 73 es el 21-ésimo número primo. Al invertir sus cifras obtenemos 37, que" );
		System.out.println("es el primo número 12. Y al invertir este obtenemos 21, que es el producto de, agarraos fuerte, 7 y 3.»");
		
		ArrayList<PromoSheldon> listap = new ArrayList<>();
		
		int cont = 0;
		//generrar el arreglo de numeros primos  
		
		for(int i = 0; i < 1000; i++) {
			if(esPrimo(i)) {
				
				cont++;
				PromoSheldon p = new PromoSheldon();
				p.setNumero(i);
				p.setInverso(invertir(i));
				p.setPocicion(cont);
				listap.add(p);
				
			}
		}
	
		
		lsitaPrimos(listap);
	}


	public static  ArrayList<PromoSheldon> lsitaPrimos( ArrayList<PromoSheldon> listp){
		ArrayList<PromoSheldon> listah = new ArrayList<>();
		Integer cont = 0;
		
		for( PromoSheldon p : listp) {
				cont =invertir(p.getNumero());
				if(esPrimo(cont)) {
					if( invertir(Integer.parseInt(getIndice(listp, cont))) == poroducto(p.getNumero().toString())) {
						System.out.println("EXITO "+p.getNumero());
						
					
					}


				}
				
		}
		
		return listah;
	}
	
	//optener el indice de un primo dentro del arreglo de numeros primos 	
	public static String getIndice(ArrayList<PromoSheldon>  listap , Integer num) {
			for(PromoSheldon p :  listap ) {
				if(p.getNumero() == num) {
					return p.getPocicion().toString();
				}
			}
		return null;
	}
	
	public static Integer  poroducto(String num) {
		 
		 Integer resulado = 1;
	 
		 Integer number = Integer.parseInt(num);
		 Integer[] digitos = new Integer[num.length()];
		 Integer i = digitos.length - 1;
	        while (number > 0) {
	            digitos[i] = number%10;
	            number = number / 10;
	            i--;
	        }

	        for(int j=0; j < digitos.length; j++){
	        	
	        	resulado = digitos[j] * resulado;
	    
	         }
		 return resulado;
	 }
	
    public static boolean esPrimo(int numero){
		  Integer contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
	
	public  static Integer invertir(Integer num) {
		Integer invertido = 0;
	    Integer resto = 0;
		while(num > 0) {
			resto = num % 10;
			invertido = invertido *10 + resto;
			num /= 10;
		}
		
	    return invertido;
	}
}
