/*
 * Variabel hiding merupakan masalah yang terjadi ketika membuat nama field sama di 
 * class child dengan nama field di class parent.
 * Untuk mengatasi variabel hiding, caranya bisa menggunakan super keyword.
 * Yang membedakan variabel hiding dengan method overriding adalah ketika sebuah object di casts.
 * Saat object di casts, method akan tetap mengakses method overriding, namun variabel akan mengakses variabel 
 * yang ada di classnya.
 */


public class Main {
    public static void main(String[] args) {
      
      Child child = new Child();
      child.name = "Irfan";
      child.doIt();
      System.out.println(child.name);

    }
}
