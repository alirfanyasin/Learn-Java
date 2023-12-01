package OOP.DefaultMethod;

/**
 * Animal
 */
public interface Animal {
  void voice();

  // kata kunci default supaya tidak mewajibkan class turunannya untuk meng-override
  default String color() {
    return "white";
  }
}
