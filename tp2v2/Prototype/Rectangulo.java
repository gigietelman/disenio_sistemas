package Prototype;

//Creamos la clase concreta extendiendo de la clase Forma
public class Rectangulo  extends Forma {

	double ancho;
	double alto;
	
    public Rectangulo(double ancho, double alto) {
        type = "Rectangulo";
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    void dibujar() {
        System.out.println("Dentro del rectangulo:: metodo dibujar !");
    }

	@Override
	public Forma clonar() {
		return new Rectangulo(ancho, alto);
	}
}
