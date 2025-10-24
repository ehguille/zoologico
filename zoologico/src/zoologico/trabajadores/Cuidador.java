package zoologico.trabajadores;
import zoologico.animales.Animal;

public final class Cuidador extends Empleado {

	public Cuidador(String nombre, int salario) {
		super(nombre, salario);
	}
	
	public void alimentar(Animal unAnimal) {
		System.out.println(nombre +" alimenta a un "+unAnimal.getClass().getSimpleName());		
	}
	
	public void trabajar(Animal unAnimal) {
		this.alimentar(unAnimal);
	}

}
