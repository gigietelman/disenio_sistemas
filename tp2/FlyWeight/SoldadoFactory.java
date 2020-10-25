import java.util.HashMap;

public class SoldadoFactory {
	
	
	    private static HashMap <String, Soldado> hm = new HashMap<String, Soldado>(); 
	  
	    public static Soldado getSoldado(String tipo) 
	    { 
	        Soldado s = null; 
	        if (hm.containsKey(tipo)) 
	                s = hm.get(tipo); 
	        else
	        { 
	            switch(tipo) 
	            { 
	            case "SoldadoAmericano": 
	                System.out.println("Soldado creado"); 
	                s = new SoldadoAmericano(); 
	                break; 
	                
		         case "SoldadoRuso": 
		                System.out.println("Soldado Ruso creado"); 
		                s = new SoldadoRuso(); 
		                break; 
	            default : 
	                System.out.println("Error!"); 
	            } 
	  
	            hm.put(tipo, s); 
	        } 
	        return s; 
	    } 
	} 


