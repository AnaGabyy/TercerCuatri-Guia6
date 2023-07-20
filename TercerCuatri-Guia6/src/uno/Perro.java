package uno;

public class Perro extends Animal{

    public Perro(String nombre, String sonido) {
        super(nombre, sonido);
    }

    @Override
    public String hacerSonido() {
        return super.hacerSonido();
    }
}
