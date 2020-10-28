package Builder;

//STEP 4
//Creamos la extension de la clase BebidaFria
public class Coca extends BebidaFria {
    @Override
    public String name() {
        return "Coca";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
