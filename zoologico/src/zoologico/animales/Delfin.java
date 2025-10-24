package zoologico.animales;
import zoologico.instalaciones.*;

//Al declarar la clase Delfin como final, no puedo crear
//subespecies de delfines.
public final class Delfin extends Mamifero {
	
	public Delfin(Instalacion instalacion) {
		super(instalacion);
		this.numeroAletas=3;
		this.numeroPatas=0;
		System.out.println("Se ha creado un delfín.");
	}
	
	/**
	 * Todos los delfines (y posibles hijos) respiran igual.
	 * Por eso este método es final.
	 */
	public final void respirar() {
		System.out.println("Un delfín respira por su espiráculo.");
	}

}
