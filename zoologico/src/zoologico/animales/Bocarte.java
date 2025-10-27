package zoologico.animales;

import zoologico.instalaciones.*;

public class Bocarte extends Pez implements Oviparo {

	public Bocarte(Acuario instalacion) {
		super(3, instalacion);
		this.numeroAletas = 3;
		System.out.println("Se ha creado un bocarte.");
		/**
		 * Las siguientes líneas comentadas son para ejemplificar el uso del super.
		 * this.contraerAnisaquis(); 
		 * contraerAnisaquis(); 
		 * super.contraerAnisaquis();
		 */
	}

	public void setInstalacion(Acuario instalacion) {
		this.instalacion = instalacion;
	}

	public void contraerAnisaquis() {
		this.tieneAnisaquis = true;
		System.out.println("Un bocarte contrae anisaquis.");
	}

	public String toString() {
		String descripcion = "[bocarte]\n";
		descripcion += super.toString() + "\n";
		descripcion += "[/bocarte]";
		return descripcion;
	}

	public void ponerHuevos() {
		System.out.println("Un bocarte pone muchos huevos");		
	}
}
