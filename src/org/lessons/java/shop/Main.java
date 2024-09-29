package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto();
		p1.setCodice();
		p1.setNome("tv");
		p1.setDescrizione("televisore 42 pollici");
		p1.setPrezzo(100);
		
		System.out.println(p1.getNomeEsteso());
		System.out.println(p1.getDescrizione());
		System.out.println(p1.getPrezzoBase());
		System.out.println(p1.getPrezzoIva());


	}

}
