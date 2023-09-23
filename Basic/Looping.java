public class Looping {
    public static void main(String[] args) {

        // ====================================
        // While Loop
        // ====================================
        int i = 0;
        while (i < 5){
            System.out.println("Loop to " + i);
            i++;
        }


        // ====================================
        // Do While Loop
        // ====================================
        int a = 0;
        do {
            System.out.println("Do while loop to " + a);
            a++;
        }while (a < 10);



        // ====================================
        // For Loop
        // ====================================
        for (int b = 1; b <= 5; b++) {
            System.out.println("For loop to " + b);
        }


        // ====================================
        // Foreach Loop
        // ====================================
        String[] cars = {"Volvo", "BWM", "Toyota", "Ford"};
        for (String c : cars) {
            System.out.println(c);
        }




    }
}
