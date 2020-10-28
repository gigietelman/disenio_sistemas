package Factory;

//Se crea una fabrica para generar objetos de clases concretas basadas en la información dada.
public class FormaFactory {

    public Forma createForma(String tipoDeForma){
        if (tipoDeForma == null){
            return null;
        }

        if (tipoDeForma.equalsIgnoreCase("CIRCULO")){
            return new Circulo();
        }
        else if (tipoDeForma.equalsIgnoreCase("RECTANGULO")){
            return new Rectangulo();
        }
        else if (tipoDeForma.equalsIgnoreCase("CUADRADO")){
            return new Cuadrado();
        }

        return null;
    }
}
