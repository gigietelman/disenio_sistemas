package nullObject;
class Programador extends AbstractEmployee {
   public Programador(String nombre) {
      this.nombre = nombre;    
   }
   @Override
   public String getNombre() {
      return nombre;
   }
   @Override
   public boolean isNull() {
      return false;
   }
}