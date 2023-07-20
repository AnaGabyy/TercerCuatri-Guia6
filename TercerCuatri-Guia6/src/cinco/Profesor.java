package cinco;

public class Profesor extends Persona{

    public Profesor(String nombre) {
        super(nombre);
    }

    @Override
    public void darClase() {
        System.out.println("El profesor " + getNombre() + " da clases");
    }
}
