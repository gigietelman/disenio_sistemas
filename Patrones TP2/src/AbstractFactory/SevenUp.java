
package AbstractFactory;

public class SevenUp extends BebidaDeLimonAbs {
	
	public SevenUp() {
		setNombre("Seven Up");
	}
	
	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}
}
