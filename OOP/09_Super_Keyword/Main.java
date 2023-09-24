public class Main {
  public static void main(String[] args) {
    
    var shape = new Shape("Segi Tiga");
    System.out.println(shape.name);
    System.out.println(shape.getCorner());

    var rectangle = new Rectangle("Segi Empat");
    System.out.println(rectangle.name);
    System.out.println(rectangle.getCorner());
    System.out.println(rectangle.getParentConrner()); // calling method parent

  }
}
