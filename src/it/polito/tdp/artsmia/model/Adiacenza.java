package it.polito.tdp.artsmia.model;

public class Adiacenza {

	private int oggetto1;
	private int oggetto2;
	private int peso;
	
	public Adiacenza(int oggetto1, int oggetto2, int peso) {
		super();
		this.oggetto1 = oggetto1;
		this.oggetto2 = oggetto2;
		this.peso = peso;
	}

	public int getOggetto1() {
		return oggetto1;
	}

	public void setOggetto1(int oggetto1) {
		this.oggetto1 = oggetto1;
	}

	public int getOggetto2() {
		return oggetto2;
	}

	public void setOggetto2(int oggetto2) {
		this.oggetto2 = oggetto2;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
	
}
