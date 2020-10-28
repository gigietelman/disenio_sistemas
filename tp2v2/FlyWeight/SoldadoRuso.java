
public class SoldadoRuso implements Soldado{
	
	  private final String actividad; 
	    private String arma; 
	  
	    public SoldadoRuso() 
	    { 
	        actividad = "Defender Bandera"; 
	    } 
	    public void asignarArma(String arma) 
	    { 
	        this.arma = arma; 
	    } 
	    public void mision() 
	    { 
	        System.out.println("Defender la paz por Rusio "
	                           + arma + "|" + " Actividad actual " + actividad); 
	    } 

}
