package Clase04State;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto= new Auto();
		auto.Avanzar();
		Semaforo semaforo= new Semaforo(auto);

		semaforo.cambiarColor("rojo");
		auto.Avanzar();
		semaforo.cambiarColor("verde");
		auto.Avanzar();
	}

}
