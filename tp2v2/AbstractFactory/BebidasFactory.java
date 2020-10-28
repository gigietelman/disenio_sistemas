
package AbstractFactory;

public class BebidasFactory {
	public AbstractFactory crearCocaColaFactory() {
		return new CocaColaFactory();
	}
	

	public AbstractFactory creaPepsiColaFactory() {
		return new PepsiFactory();
	}

}
