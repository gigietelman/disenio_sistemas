package DoubleDispatch;
public interface Elemento {
	
	Resultado jugar(Piedra elemento);
	Resultado jugar(Papel elemento);
	Resultado jugar(Tijera elemento);
	
	Resultado jugar(Elemento elmento);
}
