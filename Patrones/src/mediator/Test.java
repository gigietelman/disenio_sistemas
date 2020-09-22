package mediator;

public class Test {

	public static void main(String[] args) {
       Grupo g = new Grupo();
       Usuario a1 = new Usuario(g);
       Usuario a2 = new Usuario(g);
       Usuario a3 = new Usuario(g);
       
       
       
       
        
       g.agregarUsuario( a1 );
       g.agregarUsuario( a2 );
       g.agregarUsuario( a3 );
       
      
       a1.comunicar("Mensaje A", g);
       a2.comunicar("Mensaje b", g);

   }
	

}
