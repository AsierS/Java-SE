
public class PruebaTecnica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prueba t�cnica.");
		for (int i = -3; i <= 3; i++) {
			//System.out.println("Esta es la iteraci�n n�mero " + i + ".");
			if (i % 2 == 0) {
				if (i == 0) {
					System.out.println("Este es el n�mero 0.");
				} else {
					System.out.println("El n�mero " + i + " es par.");
				}
			} else {
				System.out.println("El n�mero " + i + " es impar.");
			}
		} //cerramos el for
		System.out.println("El bucle ha acabado.");
	} //cerramos el main

} //cerramos class