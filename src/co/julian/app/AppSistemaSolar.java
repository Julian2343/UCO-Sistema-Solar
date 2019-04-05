package co.julian.app;

import java.util.ArrayList;
import java.util.Arrays;
import co.julian.domain.Planeta;

public class AppSistemaSolar {

	public static void main(String[] args) {
		//calcular mi peso en un planeta
		
		//variable que contiene el peso de la persona
		double miPeso = 78;
		
		//constructores
		Planeta tierra = new Planeta("TIERRA", 9.81, 12742);
		Planeta marte = new Planeta("MARTE", 3.711, 6779);
		Planeta neptuno = new Planeta("NEPTUNO", 11.5, 49244);
		Planeta saturno = new Planeta("SATURNO", 10.4, 116460);
		Planeta jupiter = new Planeta("JUPITER", 24.79, 139720);
		Planeta urano = new Planeta("URANO", 8.87, 50724);
		Planeta mercurio = new Planeta("MERCURIO", 3.7, 4879.4);
		Planeta venus = new Planeta("VENUS", 8.82, 12104);
		//
		tierra.setNroLunas((byte) 1);//agrega un valo al numero de lunas que tiene tierra
		//
		
		//lista con todos los planetas que creamos en los constructores anteriores
		ArrayList<Planeta> planets = new ArrayList<>(Arrays.asList(tierra, marte, neptuno, saturno, jupiter, urano, mercurio, venus));
		
		System.out.println(planets.size());//imprime la cantidad de elementos que tiene la lista
		
		//ciclo para dar el resultado dependiendo el planeta
		for(Planeta planeta : planets) {
			System.out.println("El peso en " + planeta.getNombre() + " es " + planeta.calcularPesoPersona(miPeso) );
		
		}
		//finaliza calcular mi peso en un planeta
	}

}
