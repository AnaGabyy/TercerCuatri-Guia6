package dos;

public class ValidadorDeNumeroImp implements ValidadorDeNumero{

    private String valorInput; // input: parametros de entrada

    public ValidadorDeNumeroImp(String valorInput) {
    this.valorInput = valorInput;
    }

    @Override
    public Boolean validar() {
        Boolean result = false;

        Integer valorAnalizar = Integer.parseInt(valorInput);

        //Forma 1
        if (valorAnalizar > 0) {
            result = true;
        }


        //Forma 2
        /*isDigit valida si el caracter ingresado es un digito)*/
        if (Character.isDigit(Integer.parseInt(valorInput))) {
            result = true;
        }

        return result;
    }

    public String getValorInput() {
        return valorInput;
    }

    public void setValorInput(String valorInput) {
        this.valorInput = valorInput;
    }
}
