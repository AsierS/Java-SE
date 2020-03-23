package herencia.animales;

public class Perro extends Mamifero {
	private String nombre;
	private int numPatas;
	
	public Perro() {
		super();
		this.nombre = "Pepito";
		this.numPatas = 4;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
}


