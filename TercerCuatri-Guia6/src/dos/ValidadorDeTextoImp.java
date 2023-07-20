package dos;

import dos.ValidadorDeTexto;

public class ValidadorDeTextoImp implements ValidadorDeTexto {

    private String textoInput;

    public ValidadorDeTextoImp(String textoInput) {
        this.textoInput = textoInput;
    }

    @Override
    public Boolean validar() {
        Boolean result = false;
        //Opcion 1
        String regex = "^[a-zA-Z]+$"; //Expresion regular *INVESTIGAR
        if (textoInput.matches(regex)){
            result = true;
        }

        //Forma 2, si utilizo esto se va a romper pq no puede parsearlo, todas las letras tienen uno varios diigitos asignados
        /*if (Character.isDigit(Integer.parseInt(textoInput))){
            result = false;
        }*/

        return result;
    }

    public String getTextoInput() {
        return textoInput;
    }

    public void setTextoInput(String textoInput) {
        this.textoInput = textoInput;
    }
}
