package zoologico.trabajadores;
import zoologico.animales.*;

public class Empleado {

	protected String nombre;
	
	public Empleado(String nombre) {
		this.nombre=nombre;
	}
	
	public void firmarContrato() {
		System.out.println(nombre + " firma un contrato.");
	}
	
	public void trabajar(Animal unAnimal) {
		System.out.println(nombre + " trabaja sobre un animal.");
	}
	
}
