package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva = 1.22;
	
	void setCodice() {
		Random ran = new Random();
		codice = ran.nextInt(10000);
			}
	
	double getPrezzoIva() {
		return prezzo * iva;
	}
	
	String getNomeEsteso() {
		return nome + "-" + codice;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setDescrizione (String descrizione) {
		this.descrizione = descrizione;
	}
	
	String getDescrizione() {
		return descrizione;
	}
	
	void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	double getPrezzoBase() {
		return prezzo;
	}
	
}	
