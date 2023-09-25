/*
 * Casts bisa digunakan untuk tipe data bukan primitif
 * Sebelum melakukan casts, pastikan melakukan type check dengan menggunakan kata kunci instanceof
 * Hasil operator instanceof adalah boolean
 */

public class Main {
  public static void main(String[] args) {

    Employee employee = new Employee("Irfan");
    System.out.println(employee.name);

    employee = new Manager("Budi");
    System.out.println(employee.name);

    employee = new VicePresident("Hendry");
    System.out.println(employee.name);

    sayHello(new Employee("Irfan"));
    sayHello(new Manager("Budi"));
    sayHello(new VicePresident("Andre"));
  }

  // Type Check & Casts
  static void sayHello(Employee employee) {
    if(employee instanceof VicePresident) {
      VicePresident vp = (VicePresident) employee;
      System.out.println("Hello, " + vp.name + " kamu seorang Vice President");
    }else if(employee instanceof Manager) {
      Manager manager = (Manager) employee;
      System.out.println("Hello, " + manager.name + " kamu seorang Manager");
    }else {
      System.out.println("Hello, " + employee.name + " kamu seorang Employee");
    }
  }

  
}
