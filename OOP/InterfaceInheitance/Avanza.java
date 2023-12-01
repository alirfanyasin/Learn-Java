package OOP.InterfaceInheitance;

public class Avanza implements Car, IsMaintenance {

  @Override
  public void drive() {
    System.out.println("Ini adalah method drive");
  }

  @Override
  public int getTier() {
    return 4;
  }

  @Override
  public String getBrand() {
    return "Toyota";
  }

  public boolean IsMaintenance() {
    return false;
  }
}
