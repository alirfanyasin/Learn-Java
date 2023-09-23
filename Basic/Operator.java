public class Operator {
    public static void main(String[] args) {
        // =====================================================
        // Operator
        // =====================================================
        /*
            +       : Addition
            -       : Subtraction
            *       : Multiplication
            /       : Division
            %       : Modulus
            ++      : Increment
            --      : Decrement
         */
        // Example
        int numb1 = 50;
        int numb2 = 45;

        int result = numb1 + numb2;
        System.out.println(result);



        // =====================================================
        // Assignment Operator
        // =====================================================
        /*
            =
            +=
            -=
            *=
            /=
            %=
            &=
            |=
            ^=
            >>=
            <<=
         */
        // Example
        int x;
        x = 5;
        x += 4;
        System.out.println(x);


        // =====================================================
        // Comparison Operator
        // =====================================================
        /*
            ==          : Equal to
            !=          : Not equal
            >           : Greather than
            <           : Less than
            >=          : Greather than or equal to
            <=          : Less than or equal to
        */
        // Example
        int x1 = 6;
        int y1 = 6;
        System.out.println(x1 == y1);


        // =====================================================
        // Logical Operator
        // =====================================================
        /*
            &&          : Logical and
            ||          : Logical or
            !           : Logical not
        */
        // Example
        int x2 = 3;
        int y2 = 5;
        int x3 = 5;
        int y3 = 3;
        System.out.println(x2 < y2 && x3 > y3); // true
    }
}
