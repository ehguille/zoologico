package zoologico.animales;

import zoologico.instalaciones.*;

public final class Ornitorrinco extends Mamifero implements Oviparo {

	public Ornitorrinco(Instalacion instalacion) {
		// this.instalacion=instalacion;
		// Como no existe Mamifero(), debo invocar al único
		// constructor que tiene:
		super(instalacion);
	}

	public void ponerHuevos() {
		System.out.println("Un ornitorrinco no pone más de dos huevos.");
	}

}
