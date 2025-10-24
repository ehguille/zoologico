package zoologico.animales;
import zoologico.instalaciones.*;

public class Bocarte extends Pez {
	
	public Bocarte(Instalacion instalacion) {
		super(false, 3, instalacion);
		this.numeroAletas=3;
		System.out.println("Se ha creado un bocarte.");
		this.contraerAnisaquis();
		contraerAnisaquis();
		super.contraerAnisaquis();
	}
	
	public void contraerAnisaquis() {
		this.tieneAnisaquis=true;
		System.out.println("Un bocarte contrae anisaquis.");
	}
	
	public String toString() {
		String descripcion="[bocarte]\n";
		descripcion+=super.toString()+"\n";
		descripcion+="[/bocarte]";
		return descripcion;
	}
}
