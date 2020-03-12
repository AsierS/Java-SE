package prueba2;

public class UF2404EjercicioACoche {
	// ATRIBUTOS
	//matricula, marca,  modelo, color, potencia, cilindrada
	//Suponemos que matricula, marca,  modelo y color son datos de tipo string
	//También suponemos que potencia y cilindrada son datos de tipo float
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private float potencia;
	private float cilindrada;
	
	public UF2404EjercicioACoche() {
		super();
		this.matricula="";
		this.marca="";
		this.modelo="";
		this.color="Azul";//hacemos que el color por defecto sea azul
		this.potencia=0;//hacemos que la potencia por defecto sea 0
		this.cilindrada=0;//hacemos que la cilindrada por defecto sea 0
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "UF2404EjercicioACoche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color="
				+ color + ", potencia=" + potencia + ", cilindrada=" + cilindrada + "]";
	}
	
	
}
