
package AbstractFactory;

public class PepsiColaFactory extends AbstractFactory {

	public BebidaDeColaAbstracta crearBebidaDeCola() {
		return new Pepsi();
	}

	public BebidaDeNaranjaAbstracta crearBebidaDeNaranja() {
		return new Mirinda();
	}

}
