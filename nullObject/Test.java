public class Test {
   public static void main(String[] args) {

      EmployeeI emp = EmployeeFactory.getUser("Emp1");
      EmployeeI emp2 = EmployeeFactory.getUser("Emp3");
      EmployeeI emp3 = EmployeeFactory.getUser("Emp3");
      EmployeeI emp4 = EmployeeFactory.getUser("Emp4");

      emp.aprobar();
      emp2.aprobar();
      emp3.aprobar();
      emp4.aprobar();
      
   }
}