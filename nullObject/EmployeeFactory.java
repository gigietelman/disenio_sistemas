class EmployeeFactory {
   public static final String[] names = {"Emp1", "Emp2", "Emp3"};
   public static EmployeeI getUser(String name){
      for (int i = 0; i < names.length; i++) {
         if (names[i].equalsIgnoreCase(name)){
            return new Programador(name);
         }
      }
      return new NullEmployee();
   }
}