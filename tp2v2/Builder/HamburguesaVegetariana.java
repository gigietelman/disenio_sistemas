package Builder;

//STEP 4
//Creamos la extension de la clase burger
public class HamburguesaVegetariana extends Hamburguesa {
    @Override
    public String name() {
        return "Hamburguesa Vegetariana";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
