package singleton;

public class TestSingleton {

	public static void main(String[] args) {
	Configurator x = Configurator.getInstance();
	Configurator x2 = Configurator.getInstance();
	System.out.println(x);
	System.out.println(x2);

	}

}
