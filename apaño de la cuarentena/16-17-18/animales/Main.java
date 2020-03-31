package herencia.animales;

import java.util.ArrayList;

import com.ipartek.formacion.clases.animales.Animal;
import com.ipartek.formacion.clases.animales.Ave;
import com.ipartek.formacion.clases.animales.Canario;
import com.ipartek.formacion.clases.animales.Gato;
import com.ipartek.formacion.clases.animales.Perro;
import com.ipartek.formacion.clases.animales.Pez;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> protectora = new ArrayList<Animal>();

		Perro perro = new Perro();
		perro.setNombre("Perro");
		perro.setRaza("Perro");
		protectora.add(perro);

		Gato gato = new Gato();
		gato.setNombre("Gordo");
		protectora.add(gato);

		Canario canario = new Canario();
		canario.setNombre("Pollito");
		protectora.add(canario);

		Ave ave = new Ave();
		ave.setRaza("Pollo");
		ave.setNombre("Pollito");
		protectora.add(ave);		

		for (Animal animal : protectora) {

			// Ahora mismo todos los obejtos son de la clase Animal
			// no podemos acceder a los metodos de las clases hijas
			System.out.println(animal);

			// usar instanceof para saber si el objeto pertenece a una clase concreta
			if (animal instanceof Canario) {

				// casteamos el objeto a un objeto de la Clase Canario
				Canario c = (Canario) animal;

				// ya podemos usar sus metodos y atributos
				c.cantar();

			}
			// TODO podeis hacer mas instanceofs para preguntar por otras Clases

			//preguntamos por gato
			if (animal instanceof Gato) {		
			//cuando es gato, creamos el objeto y lo usamos para hacer algo
				Gato g = (Gato) animal;							
				g.nya();
			}
						
			//preguntamos por perro
			if (animal instanceof Perro) {
							
				//cuando es perro, creamos el objeto y lo usamos para hacer algo
				Perro p = (Perro) animal;
				//ya que podemos hacer lo que queramos, vamos a molestar al usuario
				p.guau();
			}
		}
	}

}
