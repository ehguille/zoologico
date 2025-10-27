package zoologico.instalaciones;

public class Parque extends Instalacion {

	private int m2;
	
	public Parque(String identificador, int m2) {
		super(identificador);
		this.m2=m2;
	}
	
	public String toString() {
		String parque="[parque]\n";
		parque+=this.m2+"\n";
		parque+=super.toString();
		parque+="[/parque]\n";
		return parque;
	}

}
