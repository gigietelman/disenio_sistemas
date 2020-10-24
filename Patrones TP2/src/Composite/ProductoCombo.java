
package Composite;

public class ProductoCombo extends Producto {

	public void agregar(Producto p) {
		throw new UnsupportedOperationException("No es posible realizar esta operacion");
	}

	public void quitar(Producto p) {
		throw new UnsupportedOperationException("No es posible realizar esta operacion");
	}

	public void mostrar() {
		System.out.println("Nombre: " + getNombre() + " Precio: " + getPrecio());
	}

}
