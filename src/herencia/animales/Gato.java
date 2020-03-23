package herencia.animales;

public class Gato extends Mamifero {
	private String color;
	private int numBigotitos;
	private Boolean isMono;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumBigotitos() {
		return numBigotitos;
	}
	public void setNumBigotitos(int numBigotitos) {
		this.numBigotitos = numBigotitos;
	}
	public Boolean getIsMono() {
		return isMono;
	}
	public void setIsMono(Boolean isMono) {
		this.isMono = isMono;
	}
	
}
