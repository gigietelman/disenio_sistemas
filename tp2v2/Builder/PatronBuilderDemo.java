package Builder;

//Demo que utiliza el AlmuerzoBuilder para demostrar el patron
public class PatronBuilderDemo {

    public static void main(String[] args){
        // prepareVegMeal
        Almuerzo vegMeal = new AlmuerzoBuilder().addHamburguesa(new HamburguesaVegetariana()).addBebidaFria(new Coca()).build();
        System.out.println("Comida Vegetariana:");
        vegMeal.showItems();
        System.out.println("Costo total: " + vegMeal.getCost());

        // prepareNonVegMeal
        Almuerzo nonVegMeal = new AlmuerzoBuilder().addHamburguesa(new HamburguesaDePollo()).addBebidaFria(new Pepsi()).build();
        System.out.println("Comida NO Vegetariana:");
        nonVegMeal.showItems();
        System.out.println("Costo total: " + nonVegMeal.getCost());
    }
}
