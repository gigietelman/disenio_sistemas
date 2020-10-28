
package AbstractFactory;

public abstract class BebidaDeLimonAbs {
	private int cantidad = 0;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadLimones() {
		return cantidad;
	}
	
	public void setCantidadLimones(int cantidadLimones) {
		this.cantidad = cantidadLimones;
	}
	
	public abstract void preparar();
	
}
