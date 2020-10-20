
package AbstractFactory;

public class CocaCola extends BebidaDeColaAbstracta {

	public CocaCola() {
		setNombre("ColaCola");
	}
	
	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}

}
