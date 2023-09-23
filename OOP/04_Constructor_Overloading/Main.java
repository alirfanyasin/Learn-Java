
public class Main {

  public static void main(String[] args) {
    var person1 = new PersonThree("Irfan");
    var person2 = new PersonThree("Irfan", "Jl. Anonym");
    var person3 = new PersonThree();

    System.out.println(person1.name);
    System.out.print(person2.name);
    System.out.println(person2.address);
  }
  
}
