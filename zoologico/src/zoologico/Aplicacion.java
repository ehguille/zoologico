package zoologico;
import zoologico.animales.*;
import zoologico.trabajadores.*;
import zoologico.instalaciones.*;

public class Aplicacion {

	public Aplicacion() {

		Instalacion unAcuario=new Acuario("Zona infantil",200);
		
		Pez unPez=new Bocarte(unAcuario);
		Delfin unDelfin=new Delfin(unAcuario);
		Perro unPerro=new Perro("Mestizo","Pepi", unAcuario);
		
		//Polimorfismo
		Empleado unEmpleado=new Cuidador("Manolo");

		unEmpleado.trabajar(unPerro);
		
		unEmpleado=new Limpiador("Luis");
		
		unEmpleado.trabajar(unPerro);
		
	}
	
	public static void main(String[] args) {
		Aplicacion a=new Aplicacion();
	}
}
