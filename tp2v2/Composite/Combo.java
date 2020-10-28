
package Composite;

import java.util.List;
import java.util.ArrayList;

public class Combo extends Producto {

	private List<Producto> productos = new ArrayList<>();
	
	public void agregar(Producto producto) {
		productos.add(producto);
	}
	
	public void quitar(Producto producto) {
		productos.remove(producto);
	}
	
	public void mostrar() {
		System.out.println("Combo: " + getNombre());
		for (Producto producto : productos) {
			producto.mostrar();
		}
		System.out.println(String.format("Total %s: %d", getNombre(), getPrecio()));
	}
	
	public double getPrecio() {
		double total = 0;
		for (Producto producto : productos) {
			total += producto.getPrecio();
		}
		return total;
	}
	
	public void setPrecio(double precio) {
		throw new UnsupportedOperationException("No es posible realizar esta operación");
	}

}
