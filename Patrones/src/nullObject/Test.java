package nullObject;
public class Test {
   public static void main(String[] args) {

      AbstractEmployee emp = EmployeeFactory.getCustomer("Juan");
      AbstractEmployee emp2 = EmployeeFactory.getCustomer("Gigi");
      AbstractEmployee emp3 = EmployeeFactory.getCustomer("Pedro");
      AbstractEmployee emp4 = EmployeeFactory.getCustomer("Juan Sebastian");

      System.out.println(emp.getNombre());
      System.out.println(emp2.getNombre());
      System.out.println(emp3.getNombre());
      System.out.println(emp4.getNombre());
   }
}