
package AbstractFactory;

public class PepsiFactory extends AbstractFactory {

	public BebidaColaAbs crearBebidaCola() {
		return new Pepsi();
	}

	public BebidaDeLimonAbs crearBebidaLimon() {
		return new SevenUp();
	}

}
