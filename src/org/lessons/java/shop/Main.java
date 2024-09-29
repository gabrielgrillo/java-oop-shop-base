package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto();
		p1.setCodice();
		p1.nome = "tv";
		p1.descrizione = "televisore 42 pollici";
		p1.prezzo = 100;
		
		System.out.println(p1.getNomeEsteso());
		System.out.println(p1.descrizione);
		System.out.println(p1.getPrezzoBase());
		System.out.println(p1.getPrezzoIva());


	}

}
