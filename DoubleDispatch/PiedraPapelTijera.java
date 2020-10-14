//Integrantes: Borzone, Cardenas, Etelman

package DoubleDispatch;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
	
	final Scanner reader = new Scanner(System.in);
	final private Elemento[] elementos = new Elemento[] {
			new Piedra(), new Papel(), new Tijera()
	};
	final private Random rand = new Random();
	private boolean gameOver = false;
	
	public void jugar() {
	
		while (!gameOver) {
			this.imprimirMensajeBienvenida();
			
			Elemento opcionMaquina = elementos[rand.nextInt(elementos.length)];
			try {
				Elemento opcionJugador = this.obtenerJugada();
				System.out.println(opcionJugador.jugar(opcionMaquina).getMensaje()); 
			} catch (TeclaInvalidaException e) {
				System.out.println("Presionaste una tecla invalida");
			} catch (GameOverException e) {
				System.out.println("Gracias por jugar");
			}
		}	
	}

	private Elemento obtenerJugada() throws TeclaInvalidaException, GameOverException {
		
		char opcion = reader.next().charAt(0);
		
		switch (opcion) {
			case 'q':
			case 'Q':
				throw new GameOverException();
					
			case 'p':
			case 'P': 
				return new Papel();
			
			case 'r':
			case 'R': 
				return new Piedra();
				
			case 't':
			case 'T': 
				return new Tijera();
				
			default:
				throw new TeclaInvalidaException();
		}
	}

	private void imprimirMensajeBienvenida() {
		System.out.println("Presiona la tecla 'r' Piedra, 'p' Papel, 't' Tijera o 'q' Para salir");
	}

	
	public static void main(String[] args) {
		PiedraPapelTijera juego = new PiedraPapelTijera();
		juego.jugar();
	}
}


