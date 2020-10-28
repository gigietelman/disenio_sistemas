//Etelman, Borzone, Cardenas

package Composite;

public class Main {

	public static void main(String[] args) {
		Producto macMenuFiesta = new Combo();
		macMenuFiesta.setNombre("Mac Menu Completo");

		Producto hamburguesaCheddar = new ProductoCombo();
		hamburguesaCheddar.setNombre("Hamburguesa con Salsa Cheddar");
		hamburguesaCheddar.setPrecio(400d);
		
		Producto fritas = new ProductoCombo();
		fritas.setNombre("Fritas");
		fritas.setPrecio(250d);
		
		Producto helado = new ProductoCombo();
		helado.setNombre("Helado Choco");
		helado.setPrecio(50d);
				
		macMenuFiesta.agregar(hamburguesaCheddar);
		macMenuFiesta.agregar(fritas);
		macMenuFiesta.agregar(helado);
						
		macMenuFiesta.mostrar();

	}
}
