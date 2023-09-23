public class PersonFour {
  String name;
  String address;
  final String country = "Indonesia";

  /*
   * Variable shadowing terjadi ketika membuat variable dengan nama yang sama
   * di scope yang menutupi variable dengan nama yang sama di scope di atasnya
   */

  PersonFour(String name, String address) {
    name = name; // varible shadowing
    address = address; // variabel shadowing
  }

  void sayHello(String paramName) {
    System.out.println("Hello " + paramName + ", My name is " + name);
  }
}
