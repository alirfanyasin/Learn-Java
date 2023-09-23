public class Break_and_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i == 3) {
                break;
            }
            System.out.println("Loop to " + i);
        }

        for (int a = 0; a < 5; a++){
            if(a == 2) {
                continue;
            }
            System.out.println(a);
        }
    }

}
