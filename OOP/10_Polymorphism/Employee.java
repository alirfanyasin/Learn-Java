/*
 * Polymorphism adalah sebuah object yang memiliki banyak bentuk
 * dan erat kaitannya dengan inheritance
 */

class Employee {
  String name;
  // constructor
  Employee(String name) {
    this.name = name;
  }

  void sayHello(String name) {
    System.out.println("Halo " + name + ", My name is Employee " + this.name);
  }
}


class Manager extends Employee {
  String name;
  // super constructor 
  Manager(String name){
    super(name);
  }

  void sayHello(String name) {
    System.out.println("Halo " + name + ", My name is Manager " + this.name);
  }
}


class VicePresident extends Manager {
  String name;
  VicePresident(String name) {
    super(name);
  }

   void sayHello(String name) {
    System.out.println("Halo " + name + ", My name is VicePresident " + this.name);
  }
}



