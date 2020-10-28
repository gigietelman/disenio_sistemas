package Builder;

//STEP 3
// Creamos las implementaciones abstractas de clases de la interfaz item que proveen las funcionalidades por default
public abstract class Hamburguesa implements Item{

    @Override
    public Empaquetado packing(){
        return new PapelEnvoltorio();
    }

    @Override
    public abstract float price();
}
