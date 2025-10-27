package zoologico.animales;

import zoologico.instalaciones.*;

public abstract class Animal {

	protected int numeroAletas;//Suponemos que un animal puede "perder" aletas.
	protected int numeroPatas;//Suponemos que un animal puede "perder" patas.
	protected boolean tienePulmones;
	protected boolean tieneBranquias;
	
	protected Instalacion instalacion;
	
	public Animal(Instalacion instalacion) {
		this.instalacion=instalacion;
		System.out.println("Se crea un animal");
	}
	
	public abstract void respirar();
	
	public Instalacion getInstalacion() {
		return this.instalacion;
	}
	
	public void setInstalacion(Instalacion instalacion) {
		this.instalacion=instalacion;
	}

}
