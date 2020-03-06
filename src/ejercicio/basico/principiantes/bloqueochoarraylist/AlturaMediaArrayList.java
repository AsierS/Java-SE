package ejercicio.basico.principiantes.bloqueochoarraylist;
/*
 * Programa Java que pida por teclado las alturas de N alumnos de una clase
 * y las guarde en un ArrayList de tipo Double.
 * A continuaci�n el programa calcular� la altura media de todos los alumnos,
 * cuantos alumnos hay m�s altos que la media y cuantos m�s bajos.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AlturaMediaArrayList {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
      //creamos el ArrayList que contendr� la altura de los alumnos
      ArrayList<Double> altura = new ArrayList();
      int N;
      double media;
      //obtenemos el n�mero de alumnos de la clase
      N = numeroAlumnos();
      //leemos la altura de los N alumnos
      leerAlturas(altura, N);
      //calculamos la media
      media = calcularMedia(altura);
      //mostramos los resultados
      mostrarResultados(altura, media);
      sc.close();
   }

   //M�todo para pedir por teclado el n�mero de alumnos de la clase
   public static int numeroAlumnos() {
      int n;
      do {
            System.out.print("Introduce n�mero de alumnos: ");
            n = sc.nextInt();
      } while (n < 1);
      return n;
   }

   //Este m�todo recibe el ArrayList y el n�mero de alumnos de la clase
   //Pide por teclado la altura de todos los alumnos y las guarda en el ArrayList
   public static void leerAlturas(ArrayList<Double> a, int n) {
      int i;
      double alto;
      for (i = 1; i <= n; i++) {
           do {
                 System.out.print("La altura del alumno " + i + " es: ");
                 alto = sc.nextDouble();
           } while (alto <= 0);
           a.add(alto); //a�ade la altura al final del ArrayList
      }
  }

   //Este m�todo recibe el ArrayList con todas las alturas
   //calcula y devuelve la media
   public static double calcularMedia(ArrayList<Double> a) {
      double media = 0;
      for (Double d : a) {
            media = media + d;
      }
      return media / a.size();
   }

   //Muestra la altura de todos los alumnos, la media y calcula y muestra
   //cuantos alumnos hay con altura superior a la media
   //y cu�ntos con altura inferior
   public static void mostrarResultados(ArrayList<Double> a, double media) {
      int superior = 0, inferior = 0;
      System.out.println("Alturas introducidas: ");
      System.out.println(a);
      for (Double d : a) {
            if (d > media)
                superior++;
            else if (d < media)
                       inferior++;
      }
      System.out.printf("Media: %.2f %n", media);
      System.out.println("Hay " + superior + " alumnos m�s altos que la media.");
      System.out.println("Hay " + inferior + " alumnos m�s bajos que la media.");
   }
}