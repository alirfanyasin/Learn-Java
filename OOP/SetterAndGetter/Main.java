/*
 * Encapsulation artinya memastikan data sesitif sebuah object tersembunyi dari akses luar.
 * Hal ini bertujuan agar kita bisa menjaga agar data sebuah object tetap baik dan valid.
 * Untuk membuat encapsulation biasanya menggunakan access modifier private.
 * Agar bisa diubah, kita menyediakan method untuk mengubah dan mendapatkan field tersebut
 */

/* Setter & Getter
 * Getter adalah sebuah function yang dibuat untuk mengambil data field
 * Setter adalah sebuah function yang dibuat untuk mengubah data field
 */

/*
 * Tipe Data         Getter Method           Setter Method
 * ======================================================================
 * Boolean           isNamaMethod()          setNamaMethod(boolean value)
 * Primitif          getNamaMethod()         setNamaMethod(primitif value)
 * Object            getNamaMethod()         setNamaMethod(object value)
 */

package OOP.SetterAndGetter;

public class Main {

  public static void main(String[] args) {
    Category category = new Category();
    category.setId("2");
    category.setExpensive(true);

    System.out.println("ID : " + category.getId());
    System.out.println("Expensive : " + category.isExpensive());
  }
}
