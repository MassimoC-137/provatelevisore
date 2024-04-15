package it.prova.provatelevisore.model;

public class Televisore {

	private String marca;
	private String modello;
	private double prezzo;
	private int pollici;

	public Televisore() {

	}

	public Televisore(String marca, String modello, double prezzo, int pollici) {

		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.pollici = pollici;

	}

	public String getMarca() {
		return marca;

	}

	public void setMarca(String marca) {
		this.marca = marca;

	}
	
	public String getModello() {
		return modello; 
		
	}
	
	public void setModello(String modello) {
		this.modello  = modello; 
		
	}
	
	public double getPrezzo() {
		return prezzo; 
		
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo; 
		
	}
	
	public int getPollici() {
		return pollici; 
		
	}
	
	public void setPollici(int pollici) {
		this.pollici = pollici; 
		
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++
	
	public boolean costaMenoDelBudgetDisponibile(Televisore budget) {
		
		return this.prezzo > budget.getPrezzo();
		
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public boolean haLaStessaMarcaDi(Televisore altraTv) {
		
		return this.marca == altraTv.getMarca(); 
		
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public boolean piuGrandeDi(Televisore ennesimaTv) {
		
		return this.pollici > ennesimaTv.getPollici(); 
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public boolean miglioreQualitaPrezzoDi(Televisore altraTv) {
		
		if (this.pollici > altraTv.getPollici() && this.prezzo < altraTv.getPrezzo()) {
			return true; 
		} else {
			return false;
		}
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public boolean esisteAlmenoUnoPiuEconomicoDi(Televisore[] catalogo) {
		
		for (int i = 0; i < catalogo.length; i++) {
			if (this.prezzo > catalogo[i].getPrezzo()) {
				return true; 
			} 
		}
		return false;
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public int quantiSonoPiuGrandi(Televisore[] catalogo) {
		
		int quanteTv = 0; 
		for (int i = 0; i < catalogo.length; i++) {
			if (this.pollici < catalogo[i].getPollici()) {
				quanteTv ++;
			} 
		}
		return quanteTv;
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public int quantiSonoPiuCariAvendoStessaMarca(Televisore[] catalogo) {
		
		int quanteTv = 0; 
		for (int i = 0; i < catalogo.length; i++) {
			if (this.marca.equals(catalogo[i].getMarca()) && this.prezzo < catalogo[i].getPrezzo()) {
				quanteTv ++;
			}
		}
		return quanteTv;
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public boolean ePiuCaroDellaMedia(Televisore[] catalogo) {
		
		int quanteTv = 0;
		double media = 0; 
		for (int i = 0; i < catalogo.length; i++) {
			quanteTv ++;
			media += catalogo[i].getPrezzo() / quanteTv;
		}
		
		if (this.prezzo > media) {
			return true;
		}
		return false;
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public String stampaTelevisore() {
		
		String stampa = "Marca: " + this.marca + "\n"
						+ "Modello: " + this.modello + "\n" 
						+ "Prezzo: " + this.prezzo + "\n"
						+ "Pollici: " + this.pollici; 
		return stampa;
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public static Televisore trovaIlPiuCostoso(Televisore[] catalogo) {

		Televisore piuCostoso = catalogo[0];
		for (int i = 1; i < catalogo.length; i++) {
			if (catalogo[i].getPrezzo() > piuCostoso.getPrezzo()) {
				piuCostoso = catalogo[i];
			}
		}
		return piuCostoso;
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	
}
