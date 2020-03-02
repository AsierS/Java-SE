
public class PruebaTecnica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prueba técnica.");
		for (int i = -3; i <= 3; i++) {
			//System.out.println("Esta es la iteración número " + i + ".");
			if (i % 2 == 0) {
				if (i == 0) {
					System.out.println("Este es el número 0.");
				} else {
					System.out.println("El número " + i + " es par.");
				}
			} else {
				System.out.println("El número " + i + " es impar.");
			}
		} //cerramos el for
		System.out.println("El bucle ha acabado.");
	} //cerramos el main

} //cerramos class