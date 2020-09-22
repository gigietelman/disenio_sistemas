package Clase02piedrapapeltijera;

public class Piedra implements Elemento {

	@Override
	public int jugar(Piedra elemento) {
		return 0;
	}
	
	@Override
	public int jugar(Papel elemento) {
		return -1;
	}
	
	@Override
	public int jugar(Tijera elemento) {
		return 1;
	}

}
