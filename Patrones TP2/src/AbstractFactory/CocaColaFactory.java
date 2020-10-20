
package AbstractFactory;

public class CocaColaFactory extends AbstractFactory {

	public BebidaDeColaAbstracta crearBebidaDeCola() {
		return new CocaCola();
	}

	public BebidaDeNaranjaAbstracta crearBebidaDeNaranja() {
		return new Fanta();
	}

}
