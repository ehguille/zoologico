package zoologico.animales;
import zoologico.instalaciones.*;

public class Murcielago extends Mamifero implements Volador {
	
	public Murcielago(Instalacion instalacion) {
		super(instalacion);
	}
	
	public void volar() {
		System.out.println("Los murciélagos vuelan a ciegas.");
	}

}
