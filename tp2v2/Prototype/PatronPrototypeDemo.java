package Prototype;

 
public class PatronPrototypeDemo {

    public static void main(String[] args){
        Circulo circle = new Circulo(1);
        circle.setId("1");

        Cuadrado square = new Cuadrado(2);
        square.setId("2");

        Rectangulo rectangle = new Rectangulo(1, 2);
        rectangle.setId("3");

        Forma formaClonada = square.clonar();
        Forma formaClonada2 = rectangle.clonar();
        Forma formaClonada3 = circle.clonar();
    }
}
