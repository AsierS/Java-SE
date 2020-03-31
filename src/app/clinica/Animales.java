package app.clinica;

public class Animales {

	private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private int id;
    
    
    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Animales() {
    	super();
    	this.nombre="";
    	this.especie="";
    	this.raza="";
    	this.edad=0;
    	this.id=0;
    }

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", edad=" + edad + "]";
	}
}
