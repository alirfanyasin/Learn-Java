public class PersonApp {
  public static void main(String[] args) {
    var person = new Person(); // this is object
    Person person2 = new Person(); // this is object
    person.name = "Irfan";
    person2.name = "Yasin";

    System.out.println(person.name);
    System.out.println(person2.name);
  }
}
