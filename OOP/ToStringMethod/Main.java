/*
 * toString Method
 * toString() adalah method yang terdapat di class object.
 * Method ini biasanya digunakan untuk merepresentasikan object dalam bentuk String.
 * Secara default, toString() ini akan menghasilkan : namaClass + hasCode
 * Namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca.
 */

package OOP.ToStringMethod;

public class Main {

  public static void main(String[] args) {
    Product product = new Product("Sepatu", 120000);

    System.out.println(product.name);
    System.out.println(product.price);

    System.out.println(product.toString());
  }
}
