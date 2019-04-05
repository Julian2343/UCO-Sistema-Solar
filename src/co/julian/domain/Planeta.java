package co.julian.domain;

public class Planeta {
	//atributos
	private String nombre;
	private double diametro;
	private byte nroLunas;
	private double gravedad;
	
	private static final double GRAVEDAD_EN_LA_TIERRA = 9.81;
	//finalizan atributos
	
	
	//constructores
	public Planeta(String nombre, double gravedad, double diametro) {
		this.nombre = nombre;
		this.gravedad = gravedad;
		this.diametro = diametro;
	}
	//finalizan constructores

	
	//metodos
	public double calcularPesoPersona(double pesoDePersonaEnTierra) {
		return (pesoDePersonaEnTierra / GRAVEDAD_EN_LA_TIERRA) * this.gravedad;
	}
	//finalizan metodos

	
	//getters y setters
	public byte getNroLunas() {
		return nroLunas;
	}


	public void setNroLunas(byte nroLunas) {
		this.nroLunas = nroLunas;
	}


	public String getNombre() {
		return nombre;
	}


	public double getDiametro() {
		return diametro;
	}


	public double getGravedad() {
		return gravedad;
	}
	//finalizan getters y setters
	
}
