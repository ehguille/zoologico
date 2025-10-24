package zoologico.trabajadores;
import zoologico.animales.*;

public abstract class Empleado {

	protected String nombre;
	protected int salario;
	
	public Empleado(String nombre, int salario) {
		this.nombre=nombre;
		this.salario=salario;
	}
	
	public final void firmarContrato() {
		System.out.println(nombre + " firma un contrato.");
	}
	
	public final int getSalario() {
		return salario;
	}
	
	public final void setSalario() {
		this.salario=salario;
	}
	
	public abstract void trabajar(Animal unAnimal) ;
	
}
