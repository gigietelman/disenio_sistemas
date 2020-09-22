package mediator;

public class Usuario
{
    protected GrupoI grupo;
    // -------------------------------
    
    Usuario(Grupo g){
    	this.grupo = g;
    	
    }

    public GrupoI getGrupo()
    {
        return this.grupo;
    }
    // -------------------------------
    public void setGrupo( GrupoI g )
    {
        this.grupo = g;
    }
    // -------------------------------
     public void comunicar(String message, Grupo g)
    {
        this.getGrupo().enviar(message, this);
    }
    // -------------------------------
     public  void recibir(String message, Usuario emisor) {
         System.out.println( emisor + ": " + message );
     }
}