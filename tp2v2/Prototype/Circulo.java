package Prototype;

 
public class Circulo extends Forma {
	
	double radio;

    public Circulo(double radio) {
        type = "Circulo";
        this.radio = radio;
    }

    @Override
    void dibujar() {
        System.out.println("Dentro del circulo:: metodo dibujar !");
    }

	@Override
	public Forma clonar() {
		return new Circulo(radio);
	}
}
