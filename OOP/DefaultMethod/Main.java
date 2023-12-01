/*
 * Default Method
 * Sebelumnya kita sudah tahu bahwa di interface, kita tidak bisa membuat method konkrit yang memiliki block method.
 * Namun sejak Java versi 8, ada fitur default method di Interface.
 * Fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang implement interface tersebut.
 * Ketika kita menambah satu method di interface, secara otomatis semua class yang implement akan rusak
 * karena harus meng-override method tersebut.
 * Dengan menggunakan default method, kita bisa menambahkan konkrit method interface.
 */

package OOP.DefaultMethod;

public class Main {

  public static void main(String[] args) {
    Animal cat = new Cat();

    cat.voice();
    System.out.println(cat.color());
  }
}
