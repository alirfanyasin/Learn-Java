public class CarsApp {
  public static void main(String[] args) {

    // Cars car = new Cars();
    var car = new Cars(); // This is object
    car.name = "BWM";
    car.color = "Red";
    car.speed = 3000;


    System.out.println(car.name);
    System.out.println(car.color);
    System.out.println(car.speed);
    car.specification("Japan"); // calling method


  }
}
