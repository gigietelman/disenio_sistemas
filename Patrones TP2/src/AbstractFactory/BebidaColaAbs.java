
package AbstractFactory;

public abstract class BebidaColaAbs {

	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	public abstract void preparar();
	
}
