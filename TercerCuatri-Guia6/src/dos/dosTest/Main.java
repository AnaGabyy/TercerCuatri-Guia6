package dos.dosTest;

import dos.*;

public class Main {
    public static void main(String[] args) {

        /*Crea una interfaz llamada Validador con un método llamado validar() y dos subinterfaces llamadas
        ValidadorDeTexto y ValidadorDeNumero. Crea una clase y agrega un método que tome un objeto de tipo Validador
        y lo utilice para validar un valor. Luego, crea una clase que implemente las subinterfaces y defina el método
        validar() para cada tipo de validador. Finalmente, crea un objeto de cada subinterfaz y pásalos al método
        que toma un Validador.*/

        //Estoy trabajando con Validador que es una interfaz y ValidadorDeTextoImp es una Clase que implementa esa interfaz
        //Sería lo mismo cuando uso Listas, pq es una interfaz, y arraylist es una Clase que tiene unas implementaciones en las cuales la implementación padre de todas es Lista
        Validador validadorTexto = new ValidadorDeTextoImp("123");
        System.out.println(validadorTexto.validar());

        Validador validadorNumero = new ValidadorDeNumeroImp("123");
        System.out.println(validadorNumero.validar());


        //Lo más importante de este ejercicio es que -puedo tener herencia de interfaz.
        //-No trabajo sobre ValidadorDeTexto ni ValidadorDeNumero, trabajo sobre Validador.

        //En la parte izq siempre van interfaces, cosas abstractas, cosas genericas(cuentas, vehiculos, CONTENEDORES de cosas que son abstractos por naturaleza)
        //Siempre colocamos las cosas particulares en envases/contenedores genericos. Por ejemplo en este ejercicio Validador contiene Validadores, La Lista contiene ArrayList, Los Mapas contienen HashMap
        //Lo generico contiene lo particular

        //Lo importante es tener la capacidad de entender que los contenedores en el lenguaje que sea, tiene que ser lo más abstracto posible

        //Este ejercicio es Contravarianza pq aunque las clases sean las que implementen el metodo "Validar", en el Main llamo es a Validador para que me resuelva eso y no a las clases
        //Es decir, En el main el que está haciendo to´ es la referencia del "Validador", e internamente ocurre el polimorfismo. El contenedor es "Validador"

        //Hay dos formas de realizar herencia y polimorfismo, Con contravarianza o con covarianza
    }
}
