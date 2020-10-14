package singleton;


public class Configurator {
	
	private static Configurator instance;
	
	private Configurator() {}
	
	public static Configurator getInstance() {
		if(instance == null){
			instance = new Configurator();
		}
		return instance;
	}
	 
	
 
}