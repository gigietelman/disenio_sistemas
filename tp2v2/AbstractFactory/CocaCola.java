
package AbstractFactory;

public class CocaCola extends BebidaColaAbs {

	public CocaCola() {
		setNombre("Coca Cola");
	}
	
	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}

}
