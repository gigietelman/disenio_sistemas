package Clase04SubastaObserver;

public class OferenteProducto implements Oferente{

String nombre;
	
	public OferenteProducto(String nombre) {
		this.nombre=nombre;
	}

	@Override
	public float ofertar(float precio) {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public String getNombre() {
		return nombre;
	}
	
}
