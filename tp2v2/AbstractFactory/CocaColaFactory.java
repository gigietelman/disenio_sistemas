
package AbstractFactory;

public class CocaColaFactory extends AbstractFactory {

	public BebidaColaAbs crearBebidaCola() {
		return new CocaCola();
	}

	public BebidaDeLimonAbs crearBebidaLimon() {
		return new Sprite();
	}

}
