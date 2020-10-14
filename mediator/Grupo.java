package mediator;
import java.util.List;
import java.util.ArrayList;


public class Grupo implements GrupoI {
	
	
	private List<Usuario> usuarios;
	    // -------------------------------
	    public Grupo()
	    {
	        this.usuarios = new ArrayList<Usuario>();
	    }
	    // -------------------------------
	     public void agregarUsuario(Usuario usuario)
	    {
	        this.usuarios.add( usuario );
	    }
	     
	     public void eliminarUsuario(Usuario usuario)
		    {
		        this.usuarios.remove( usuario );
		    }
		    
	    
	

	@Override
	public void enviar(String message, Usuario emisor) {
		for( Usuario usuario : usuarios )
        {
            if( usuario != emisor )
            {
                usuario.recibir( message, emisor );
            }
        }
		
	}

}
