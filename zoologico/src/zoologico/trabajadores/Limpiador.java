package zoologico.trabajadores;
import zoologico.animales.Animal;

public class Limpiador extends Empleado {

	public Limpiador(String nombre) {
		super(nombre);
	}
	
	public void limpiar(Animal unAnimal) {
		System.out.println(nombre+ "limpia un animal.");
	}
	
	public void trabajar(Animal unAnimal) {
		this.limpiar(unAnimal);
	}

}
