package zoologico.animales;
import zoologico.instalaciones.*;

public class Perro extends Mamifero {
	
	private String raza, nombre;
	
	public Perro(String raza, String nombre, Instalacion instalacion) {
		super(instalacion);
		this.raza=raza;
		this.nombre=nombre;
		this.numeroAletas=0;
		this.numeroPatas=4;
		System.out.println("Se ha creado un perro.");
	}
	
	/**
	 * Método final porque los posibles hijos de la clase perro
	 * respirarán todos de la misma manera.
	 */
	public final void respirar() {
		System.out.println("Los perros respiran por la boca.");
	}
	
	/**
	 * Imprime información del perro.
	 */
	public String toString() {
		String descripcion;
		descripcion="[perro]\n";
		descripcion+="- Nombre: "+nombre+"\n";
		descripcion+="- Raza: "+raza+"\n";
		descripcion+="- Número de patas: "+numeroPatas+"\n";
		descripcion+="- Número de aletas: "+numeroAletas+"\n";
		descripcion+="- ¿Tiene branquias?: "+tieneBranquias+"\n";
		descripcion+="- ¿Tiene pulmones?: "+tienePulmones+"\n";
		descripcion+="[/perro]";
		return descripcion;
	}

}
