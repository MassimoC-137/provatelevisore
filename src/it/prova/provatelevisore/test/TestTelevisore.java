package it.prova.provatelevisore.test;

import it.prova.provatelevisore.model.Televisore;

public class TestTelevisore {

	public static void main(String[] args) {

		Televisore tv1 = new Televisore("Samsung", "QN90B Neo QLED", 500.00, 55); 
		Televisore tv2 = new Televisore("Sony", "Bravia X80K 8K", 800.00, 65); 
		Televisore tv3 = new Televisore("LG", "Evo sC2 OLED", 900.00, 73); 
		Televisore tv4 = new Televisore("Philips", "s706 OLED", 550.00, 50); 
		Televisore tv5 = new Televisore("Hisense", "A6G 4K", 400.00, 43); 
		
//		System.out.println(tv3.costaMenoDelBudgetDisponibile(tv1));
//		
//		System.out.println(tv1.haLaStessaMarcaDi(tv5));
//		
//		System.out.println(tv2.piuGrandeDi(tv4));
//		
//		System.out.println(tv1.miglioreQualitaPrezzoDi(tv4));
		
		Televisore[] catalogo = {tv1, tv2, tv3, tv4, tv5}; 
		Televisore miaTv = new Televisore("Pappalozz", "Tubo catodico", 100.00, 32); 
		
//		if (miaTv.esisteAlmenoUnoPiuEconomicoDi(catalogo)) {
//			System.out.println("Esiste un televisore meno costoso del mio");
//		} else {
//			System.out.println("Il mio televisore è il più economico");
//		}
//		
//		System.out.println("Il numero di televisori più grandi del mio è " + miaTv.quantiSonoPiuGrandi(catalogo));
//		
//		System.out.println("Ci sono " + miaTv.quantiSonoPiuCariAvendoStessaMarca(catalogo) + " tv della stessa marca più care della mia");
//
//		System.out.println(miaTv.esisteAlmenoUnoPiuEconomicoDi(catalogo));
//				
//		System.out.println(tv1.stampaTelevisore(tv1));
		
		Televisore ret = Televisore.trovaIlPiuCostoso(catalogo);
		System.out.println(ret.stampaTelevisore());
	
		
	}

}
