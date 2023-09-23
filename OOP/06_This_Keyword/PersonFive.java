public class PersonFive {
  String name;
  String address;
  final String country = "Indonesia";

  /*
   * This keyword di gunakan untuk mengakses sebuah field yang namanya sama dengan
   * paramater method atau constructor
   */

  PersonFive(String name, String address) {
    this.name = name; // this keyword
    this.address = address; // this keyword
  }

  void sayHello(String paramName) {
    System.out.println("Hello " + paramName + ", My name is " + name);
  }
}
