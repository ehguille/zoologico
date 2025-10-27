package zoologico.animales;
import zoologico.instalaciones.*;

public abstract class Pez extends Animal {

	protected boolean tieneAnisaquis;

	public Pez(int numeroAletas, Instalacion instalacion) {
		super(instalacion);
		this.numeroAletas = numeroAletas;
		this.numeroPatas = 0;
		this.tieneBranquias = true;
		this.tienePulmones = false;
		this.tieneAnisaquis = false;
		System.out.println("Se ha creado un pez.");
	}

	public final void respirar() {
		System.out.println("Un pez respira con sus branquias");
	}

	public void contraerAnisaquis() {
		this.tieneAnisaquis = true;
		System.out.println("Un pez contrae anisaquis");
	}

	public String toString() {
		String descripcion = "[pez]" + "\n";
		descripcion += "- ¿Tiene anisaquis? " + this.tieneAnisaquis + "\n";
		descripcion += "- Número de aletas: " + this.numeroAletas + "\n";
		descripcion += "[/pez]";
		return descripcion;
	}

}
