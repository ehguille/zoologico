package zoologico.instalaciones;

public class Jaula extends Instalacion {
	
	protected int m2;
	
	public Jaula(String identificador, int m2) {
		super(identificador);
		this.m2=m2;
	}
	
	public String toString() {
		String acuario="[acuario]\n";
		acuario+=this.m2+"\n";
		acuario+=super.toString();
		acuario+="[/acuario]\n";
		return acuario;
	}

}
