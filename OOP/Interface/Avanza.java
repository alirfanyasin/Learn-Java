package OOP.Interface;

public class Avanza implements Car {

  @Override
  public void drive() {
    System.out.println("Halo ini adalah mobil avanza");
  }

  @Override
  public int getTier() {
    return 20;
  }
}
