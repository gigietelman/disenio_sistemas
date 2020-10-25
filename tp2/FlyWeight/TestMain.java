
public class TestMain {

	public static void main(String[] args) {
		
		        String tipo;
		        String tipo2;
		        
		        tipo = "SoldadoAmericano";
		        tipo2 = "SoldadoRuso";
		    
		        for (int i = 0; i < 10; i++) 
		        {   
		        	if (i%2==0) {
		                Soldado p = SoldadoFactory.getSoldado(tipo); 
		                p.asignarArma("ak47"); 
			  		    p.mision(); 
		        	}else {
		        		Soldado p = SoldadoFactory.getSoldado(tipo2); 
		        		 p.asignarArma("Ak57"); 
				  		 p.mision(); 
		        	}
		        } 
		    
	}

}

