
package ex1;


import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
	
	private String nombre;
	private int edad;
	private List<Prestamo> prestamos;
	
	//Constructor heredado
	public Profesor(String nombre, int edad, String numtlf) {
		super(numtlf);
		this.nombre = nombre;
		this.edad = edad;
		prestamos=new ArrayList<Prestamo>();
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//----------------
	
	public void asignarPrestamo(Prestamo prestamo) {
		
		prestamos.add(prestamo);
		
	}
	
	public void printListaPrestamos() {
		
		for (Prestamo p: prestamos) {
			System.out.println(p);
		}
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", edad=" + edad + "]";
	}

}