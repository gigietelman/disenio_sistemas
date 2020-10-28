
package AbstractFactory;

public class Sprite extends BebidaDeLimonAbs {
	
	public Sprite() {
		setNombre("Sprite");
	}
	
	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}
}
