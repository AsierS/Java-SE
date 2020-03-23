package herencia.animales;

public class Animales {
	private String nombre;

	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
