package ex1;

//Programa main
public class Principal {

	public static void main(String[] args) {

		String nom = "Vicent";
		String numtlf = "695263711";
		Profesor profe = new Profesor(nom, 21, numtlf);

		System.out.println(profe);

		Prestamo pres = new Prestamo("5000€");

		profe.asignarPrestamo(pres);

		Prestamo pres2 = new Prestamo("10000€");

		profe.asignarPrestamo(pres2);

		profe.printListaPrestamos();
	}

}