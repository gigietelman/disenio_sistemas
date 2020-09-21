package Clase04SubastaObserver;

public class OferenteSuma implements Oferente {

	String nombre;
	
	public OferenteSuma(String nombre) {
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
