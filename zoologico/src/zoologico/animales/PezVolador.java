package zoologico.animales;
import zoologico.instalaciones.*;

public class PezVolador extends Pez implements Volador, Oviparo {

	public PezVolador(Instalacion instalacion) {
		//Suponemos que tiene 5 aletas.
		super(5,instalacion);
	}
	
	public void volar() {
		System.out.println("Un pez volador da saltitos fuera del agua.");
	}
	
	public void ponerHuevos() {
		System.out.println("Un pez volador pone huevos a cholón.");
	}
}
