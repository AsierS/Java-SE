package ejercicio.basico.principiantes.bloquesiete;

import java.util.Scanner;

public class MediaArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
	    int pos = 0, neg = 0; //contadores de los n�meros positivos y negativos
        int[] numeros = new int[10]; //array que contendr� los n�meros le�dos por teclado
        double sumaPos = 0, sumaNeg = 0; //acumuladores para las sumas de positivos y negativos
        
        //lectura de datos y llenar el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }
	        //recorrer el array para sumar por separado los n�meros positivos 
         // y los negativos 
        for (i = 0; i < 10; i++) {
        	if (numeros[i] > 0){ //sumar positivos
        		sumaPos += numeros[i];
	            pos++;
	            } else if (numeros[i] < 0){ //sumar negativos
	                sumaNeg += numeros[i];
	                neg++;
	            }
	        }

        //Calcular y mostrar las medias
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }
		sc.close();
	}

}
