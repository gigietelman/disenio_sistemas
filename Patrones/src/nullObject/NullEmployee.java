package nullObject;
class NullEmployee extends AbstractEmployee {
  

  @Override
   public boolean isNull() {
      return true;
   }

@Override
public String getNombre() {
	// TODO Auto-generated method stub
	return  "No Disponible"; 

}
}