package quintoEjercicioTest;

import quintoEjercicio.Curso;
import quintoEjercicio.Estudiante;
import quintoEjercicio.Profesor;

public class Main {

    public static void main(String[] args) {

        /*Crea una clase llamada Persona y dos subclases llamadas Estudiante y Profesor. Agrega un método
        llamado darClase() a la clase Persona y redefine este método en la subclase Profesor. Luego, crea una clase
        llamada Curso y agrega un método llamado inscribirse() que toma un objeto de tipo Persona. Luego, crea
        una instancia de Curso y llama a su método inscribirse() pasándole tanto un objeto de tipo Estudiante
        como uno de tipo Profesor.*/

        Estudiante estudiante = new Estudiante("Petronilo");
        Profesor profesor = new Profesor("Sutanejo");

        Curso curso = new Curso();
        curso.inscribirse(estudiante);
        curso.inscribirse(profesor);

    }
}
