package ejercicio.basico.principiantes.bloquetres;

import java.util.Scanner;

public class HorasMinutosSegundos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce las horas: ");
        int horas = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce las horasos minutos: ");
        int minutos = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce los segundos: ");
        int segundos = Integer.parseInt(sc.nextLine());
        
        if (horas<0 || horas>23) {
        	System.out.println("La hora tiene que estar entre 0 y 23. Esto es ilegal.");
        } else if (minutos<0 || minutos>59) {
			System.out.println("Los minutos tienen que estar entre 0 y 59. Esto es ilegal.");
		} else if (segundos<0 || segundos>59) {
			System.out.println("Los segundos tienen que estar entre 0 y 59. Esto es ilegal.");
		} else {
			System.out.println("La hora es válida y tú también.");
		}
		sc.close();
	}

}
