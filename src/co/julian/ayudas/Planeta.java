package co.julian.ayudas;

public class Planeta {
	private double gravedadEnTierra = 9.8;
	
	private String nombre;
	private double gravedad;
	private double diametro;
	private byte nroLunas;
	
	public Planeta(String nombre, double gravedad, double diametro) {
		this.nombre = nombre;
		this.gravedad = gravedad;
		this.diametro = diametro;
	}

	public double calcularPesoPersona(double pesoDePersonaEnTierra) {
		return (pesoDePersonaEnTierra * this.gravedad) / this.gravedadEnTierra;
	}

	public byte getNroLunas() {
		return nroLunas;
	}

	public void setNroLunas(byte nroLunas) {
		this.nroLunas = nroLunas;
	}

	public String getNombre() {
		return nombre;
	}

	public double getGravedad() {
		return gravedad;
	}

	public double getDiametro() {
		return diametro;
	}
}












