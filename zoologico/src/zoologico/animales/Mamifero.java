package zoologico.animales;

import zoologico.instalaciones.*;

public abstract class Mamifero extends Animal {

	// Los siguientes atributos son finales en Mamifero porque todos
	// sus hijos tendrán el mismo valor. No puedo hacerlos finales en
	// su superclase porque cambia en sus hijos.
	protected final boolean tienePulmones, tieneBranquias;

	public static final int MAX_NUMERO_PATAS = 4;

	protected Mamifero(Instalacion instalacion) {
		super(instalacion);
		this.tieneBranquias = false;
		this.tienePulmones = true;
		System.out.println("Se ha creado un mamífero.");
	}

	public void respirar() {
		System.out.println("Los mamíferos respiran con pulmones");
	}

}
