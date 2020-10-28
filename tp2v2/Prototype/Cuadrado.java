package Prototype;

 
public class Cuadrado extends Forma {
	
	double lado;

    public Cuadrado(double lado) {
        type = "Cuadrado";
        this.lado = lado;
    }

    @Override
    void dibujar() {
        System.out.println("Dentro del cuadrado:: metodo dibujar !");
    }

	@Override
	public Forma clonar() {
		return new Cuadrado(lado);
	}
	
}
