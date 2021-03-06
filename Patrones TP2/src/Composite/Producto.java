
package Composite;

public abstract class Producto {
	private String nombre;
	private double precio;
	
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract void agregar(Producto p);
    public abstract void quitar(Producto p);
    public abstract void mostrar();
    
}
