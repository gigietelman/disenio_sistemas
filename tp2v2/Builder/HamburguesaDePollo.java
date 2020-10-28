package Builder;

//STEP 4
//Creamos la extension de la clase burger
public class HamburguesaDePollo extends Hamburguesa {

    @Override
    public String name() {
        return "Hamburguesa de Pollo";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
