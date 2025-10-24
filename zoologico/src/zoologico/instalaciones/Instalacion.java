package zoologico.instalaciones;

public abstract class Instalacion {

	protected String identificador; 
	
	protected Instalacion(String identificador) {
		this.identificador=identificador;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador=identificador;
	}
	
	public String toString() {
		String instalacion="[instalacion]\n";
		instalacion+="- ubicacion: "+identificador+"\n";
		instalacion+="[/instalacion]";
		return instalacion;
	}

}
