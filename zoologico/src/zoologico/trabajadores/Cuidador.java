package zoologico.trabajadores;
import zoologico.animales.Animal;

public final class Cuidador extends Empleado {

	public Cuidador(String nombre) {
		super(nombre);
	}
	
	public void alimentar(Animal unAnimal) {
		System.out.println(nombre +" alimenta a un animal. El animal es del tipo "+unAnimal.getClass());		
	}
	
	public void trabajar(Animal unAnimal) {
		this.alimentar(unAnimal);
	}

}
