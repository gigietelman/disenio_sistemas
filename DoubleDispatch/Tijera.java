package DoubleDispatch;

public class Tijera implements Elemento {

	@Override
	public Resultado jugar(Piedra elemento) {
		return Resultado.PERDISTE;
	}

	@Override
	public Resultado jugar(Papel elemento) {
		return Resultado.GANASTE;
	}

	@Override
	public Resultado jugar(Tijera elemento) {
		return Resultado.EMPATASTE;
	}
	
	@Override
	public Resultado jugar(Elemento elemento) {
		return elemento.jugar(this);
	}

}
