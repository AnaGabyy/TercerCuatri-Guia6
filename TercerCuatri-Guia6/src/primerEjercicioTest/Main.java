package primerEjercicioTest;

import primerEjercicio.Gato;
import primerEjercicio.Perro;
import primerEjercicio.Veterinario;

public class Main {

    public static void main(String[] args) {

        /*Crea una clase llamada Animal y dos subclases llamadas Perro y Gato. Agrega un método llamado
        hacerSonido() a la clase Animal y redefine este método en las subclases para que cada subclase haga
        un sonido diferente. Luego, crea una clase llamada Veterinario y agrega un método llamado tratarAnimal()
        que tome un objeto de tipo Animal. Luego, crea una instancia de Veterinario y llama a su método
        tratarAnimal() pasándole tanto un objeto de tipo Perro como uno de tipo Gato.*/

        Perro perro = new Perro("Petra","Guau");
        Gato gato = new Gato("Clau" ,"Miau");

        Veterinario veterinario = new Veterinario();

        veterinario.tratarAnimal(perro,gato);


    }

}
