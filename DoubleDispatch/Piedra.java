package DoubleDispatch;

public class Piedra implements Elemento {

	@Override
	public Resultado jugar(Piedra elemento) {
		return Resultado.EMPATASTE;
	}
	
	@Override
	public Resultado jugar(Papel elemento) {
		return Resultado.PERDISTE;
	}
	
	@Override
	public Resultado jugar(Tijera elemento) {
		return Resultado.GANASTE;
	}

	@Override
	public Resultado jugar(Elemento elemento) {
		return elemento.jugar(this);
	}
}
