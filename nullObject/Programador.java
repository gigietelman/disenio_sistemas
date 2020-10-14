class Programador implements EmployeeI {

private String nombre;
public Programador(String nombre) {
      this.nombre = nombre;    
   }
   public String getNombre() {
      return nombre;
   }
@Override
public void aprobar() {
    System.out.println("El usuario aprobo la orden");	
}
  
}