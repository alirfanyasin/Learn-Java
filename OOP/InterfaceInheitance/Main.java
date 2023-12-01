/*
 * Interface Inheritance
 * Sebelumnya kita sudah tahu kalo di Java, child class hanya bisa memiliki 1 parent clas.
 * Namun berbeda dengan interface, sebuah child class bisa implement lebih dari 1 interface.
 * Bahkan interface pun bisa implement ke interface lain, bisa lebih dari 1.
 * Namun jika interface ingin mewarisi interface lain, kita menggunakan kata kunci extends, bukan implement.
 */

package OOP.InterfaceInheitance;

public class Main {

  public static void main(String[] args) {
    Avanza avanza = new Avanza();

    avanza.drive();
    System.out.println(avanza.getTier());
    System.out.println(avanza.getBrand());
    System.out.println(avanza.IsMaintenance());
  }
}
