public class VicePresidentTwo extends ManagerTwo {

  /*
   * Method yang dimiliki oleh class child dengan nama yang sama 
   * maka method yang di class parent tidak bisa akses
   */


  // Method Overriding
  void sayHello(String name){
    System.out.println("Halo, " + name + ", my name is VP " + this.name);
  }
  
}
