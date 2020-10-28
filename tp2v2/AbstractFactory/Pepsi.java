
package AbstractFactory;

public class Pepsi extends BebidaColaAbs {

	public Pepsi() {
		setNombre("Pepsi");
	}
	
	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}

}
