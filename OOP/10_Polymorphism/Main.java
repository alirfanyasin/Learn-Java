class Main {
  
  public static void main(String[] args) {
    
    Employee employee = new Employee("Irfan");
    System.out.println(employee.name);
    employee.sayHello("Hendry");
  
    employee = new Manager("Aziz");
    System.out.println(employee.name);
    employee.sayHello("Hendry");


    employee = new VicePresident("Danil");
    System.out.println(employee.name);
    employee.sayHello("Hendry");

    sayHello(new Employee("Budi, kamu seorang Employee"));
    sayHello(new Manager("Herry, kamu seorang Manager"));
    sayHello(new VicePresident("Egi, kamu seorang VP"));
  }

  // Method Polymorphism
  static void sayHello(Employee employee) {
    System.out.println("Hello " + employee.name);
  }
}
