public class Rectangle extends Shape{

  /*
   * Ketika di parent class ada constructor maka di child wajib 
   * membuat constructor
   */
  Rectangle(String name) {
    super(name);
  }

  // Method overriding
  int getCorner() {
    return 4;
  }

  int getParentConrner() {
    return super.getCorner(); // super keyword (memanggil method yang dimiliki oleh parent class)
  }
}
