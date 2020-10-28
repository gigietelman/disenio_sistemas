
public class SoldadoAmericano implements Soldado{
	
	    
	   private final String actividad; 
	    private String arma; 
	  
	    public SoldadoAmericano() 
	    { 
	        actividad = "Capturar Bandera"; 
	    } 
	    public void asignarArma(String arma) 
	    { 
	        this.arma = arma; 
	    } 
	    public void mision() 
	    { 
	        System.out.println("Defender la paz por los aliados "
	                           + arma + "|" + " Actividad actual " + actividad); 
	    } 
	} 

