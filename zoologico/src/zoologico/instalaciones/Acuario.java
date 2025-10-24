package zoologico.instalaciones;

public class Acuario extends Instalacion {
	
	private int m3;
	
	public Acuario(String ubicacion,int m3) {
		super(ubicacion);
		this.m3=m3;
	}
	
	public int getCapacidad() {
		return m3;
	}
	
	public void setCapacidad(int m3) {
		this.m3=m3;
	}
	
	public String toString() {
		String acuario="[acuario]\n";
		acuario+=this.m3+"\n";
		acuario+=super.toString();
		acuario+="[/acuario]\n";
		return acuario;
	}

}
