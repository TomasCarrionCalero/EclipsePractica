package ex1;

public class Persona {
	
	protected String numtlf;
	
	// Constructor
	public Persona(String numtlf) {	
		this.numtlf = numtlf;
	}
	//Getter y setter
	public String getNumeroDeTelefono() {
		return numtlf;
	}
	public void setNumeroDeTelefono(String numtlf) {
		this.numtlf = numtlf;
	}
}