package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	double prezzo;
	double iva = 1.22;
	
	void setCodice() {
		Random ran = new Random();
		codice = ran.nextInt(10000);
			}
	
	double getPrezzoBase() {
		return prezzo;
	}
	
	double getPrezzoIva() {
		return prezzo * iva;
	}
	
	String getNomeEsteso() {
		return nome + "-" + codice;
	}
	
}
