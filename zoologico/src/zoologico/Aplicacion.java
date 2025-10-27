package zoologico;

import zoologico.animales.*;
import zoologico.trabajadores.*;
import zoologico.instalaciones.*;

public class Aplicacion {

	public Aplicacion() {

		// Creo ubicaciones
		Acuario unAcuario = new Acuario("Zona infantil", 200);
		Parque unParque = new Parque("Zona salvaje", 5000);
		Jaula unaJaula = new Jaula("Zona mamíferos", 100);

		// Creo animales
		Pez unPez = new Bocarte(unAcuario);
		Delfin unDelfin = new Delfin(unAcuario);
		Perro unPerro = new Perro("Mestizo", "Pepi", unaJaula);

		// Creo empleados
		Empleado unEmpleado = new Cuidador("Manolo", 24000);
		unEmpleado.trabajar(unPerro);
		unEmpleado.trabajar(unDelfin);
		unEmpleado = new Limpiador("Luis", 20000);
		unEmpleado.trabajar(unPerro);

		// Ejemplos para ilustrar constantes y static.

		System.out.println(unPerro.MAX_NUMERO_PATAS);
		System.out.println(unDelfin.MAX_NUMERO_PATAS);
		System.out.println(Mamifero.MAX_NUMERO_PATAS);

		PezVolador unPezVolador = new PezVolador(unAcuario);
		// Puedo consultar el MIN_NUMERO_HUEVOS, pero no cambiarlo.
		System.out.println(Oviparo.MIN_NUMERO_HUEVOS);
	}

	public static void main(String[] args) {
		Aplicacion a = new Aplicacion();
	}
}
