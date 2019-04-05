package co.julian.ayudas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppSistemaSolar {
	
	public static void main(String[] args) {
		
		double miPeso = 78;
		
		Planeta tierra = new Planeta("TIERRA", 9.8, 12742);
		Planeta marte = new Planeta("MARTE", 3.711, 6779);
		Planeta jupiter = new Planeta("JUPITER", 23.13, 139720);
		Planeta venus = new Planeta("VENUS", 8.82, 12104);
		Planeta neptuno = new Planeta("NEPTUNO", 10.97, 49244);
		tierra.setNroLunas((byte) 1);
		
		ArrayList<Planeta> planets = new ArrayList<>(Arrays.asList(tierra, marte, jupiter));
		
		planets.add(neptuno);
		planets.add(venus);
		
		planets.remove(0);
		planets.remove(venus);
		
		System.out.println(planets.size());
		
		for (Planeta planeta : planets) {
			System.out.println("El peso en " + planeta.getNombre() + " es " + planeta.calcularPesoPersona(miPeso));
		}
	}
}







