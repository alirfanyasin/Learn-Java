public class Main {
  public static void main(String[] args) { 
    // Calling parent class
    var manager = new Manager();
    manager.name = "Irfan";
    System.out.println(manager.name);
    manager.sayHello("Dewi");

    // Calling child class
    var vp = new VicePresident();
    vp.name = "Joko";
    System.out.println(vp.name);
    vp.sayHello("Budi");
    
  }
  
}
