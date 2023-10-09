public class Parent {
    String name;
    
    void doIt() {
      System.out.println("Do it from parent");
    }
}



public class Child extends Parent {
  String name; // variable hiding

  // method overriding
  void doIt() {
    System.out.println("Do it from child");
  }

}