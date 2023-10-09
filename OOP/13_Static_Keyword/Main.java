public class Main {

  public static void main(String[] args) {
    // tanpa menggunakan static keyword
    Data data = new Data();
    data.laptop();

    // menggunakan static keyword
    Data.handphone();
  }
}

class Data {

  void laptop() {
    System.out.println("Barang laptop");
  }

  static void handphone() {
    System.out.println("Barang handphone");
  }
}
