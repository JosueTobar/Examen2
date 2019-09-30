package main.java;

public class PromoSheldon {
	 private Integer numero;
	 private Integer inverso;
	 private Integer pocicion;
	
	public PromoSheldon() { 
		
	}
	public PromoSheldon(Integer numero, Integer inverso, Integer pocicion) {	
		this.numero = numero;
		this.inverso = inverso;
		this.pocicion = pocicion;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getInverso() {
		return inverso;
	}
	public void setInverso(Integer inverso) {
		this.inverso = inverso;
	}
	public Integer getPocicion() {
		return pocicion;
	}
	public void setPocicion(Integer pocicion) {
		this.pocicion = pocicion;
	}
	
	@Override
	public String toString() {
		return "PromoSheldon [numero=" + numero + ", inverso=" + inverso + ", pocicion=" + pocicion + "]";
	}
	
	
	
	
	
}
