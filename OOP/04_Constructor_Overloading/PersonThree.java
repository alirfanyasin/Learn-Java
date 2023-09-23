public class PersonThree {
    String name;
    String address;
    int age;

    // Constructor Overloading (dengan syarat parameter berbeda)
     PersonThree(String paramName, String paramAddress){
      name = paramName;
      address = paramAddress;
    }

    PersonThree(String paramName){
      this(paramName, null); // memanggil constructor lain (yang diatas)
    }

   
    PersonThree() {
      this(null); // memanggil constructor lain (yang diatas)
    }
}
