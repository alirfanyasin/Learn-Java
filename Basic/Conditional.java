public class Conditional {
    public static void main(String[] args) {
        int x = 50, y = 30;

        // This is if else statement
        if (x > y) {
            // If the result is true, then execute this statement
            System.out.println(true);
        }else{
            // If the result is false, then execute this statement
            System.out.println(false);
        }



        // Using else if
        if(x > y) {
            System.out.println("The result is true");
        }else if(x == y) {
            System.out.println("The result is the same");
        }else {
            System.out.println("The result is the false");
        }


        // Ternary Operator
        String result = (x < y) ? "The result is true" : "The result is false";
        System.out.println(result);
    }
}
