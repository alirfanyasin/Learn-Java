/*
 * Interface
 * Sebelumnya kita sudah tau bahwa abstract class bisa kita gunakan sebagi kontrak untuk class child nya.
 * Namun sebenernya yang lebih tepat untuk kontrak adalah interface.
 * Jangan salah sangka bahwa interface disini bukanlah User Interface.
 * Interface mirip seperti abstract class, yang membedakan adalah di interface, semua method otomatis abstract. tidak memiliki block.
 * Di interface tidak boleh memiliki field kita hanya boleh memiliki constant (field yang tidak bisa di ubah).
 * Untuk mewariskan interface, kita tidak menggunakan kata kunci extend, melainkan implements.
 * Semua mwthod yang ada di interface wajib di override.
 */
package OOP.Interface;

public class Main {

  public static void main(String[] args) {
    Car avanza = new Avanza();

    avanza.drive();
    System.out.println(avanza.getTier());
  }
}
