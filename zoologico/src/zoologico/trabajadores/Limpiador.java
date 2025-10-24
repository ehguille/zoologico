package zoologico.trabajadores;
import zoologico.animales.Animal;

public class Limpiador extends Empleado {

	public Limpiador(String nombre, int salario) {
		super(nombre, salario);
	}
	
	public void limpiar(Animal unAnimal) {
		System.out.println("Limpiando la instalación "+unAnimal.getInstalacion().getIdentificador());
	}
	
	public void trabajar(Animal unAnimal) {
		this.limpiar(unAnimal);
	}

}
