package OOP.Interface;

public class Main {

  public static void main(String[] args) {
    Car avanza = new Avanza();

    avanza.drive();
    System.out.println(avanza.getTier());
  }
}
