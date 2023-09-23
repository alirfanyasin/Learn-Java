public class Method {
    public static void main(String[] args) {
        // Calling method
        hello();
        sayHello("Irfan", "Yasin");

        var result = sum(100, 340);
        System.out.println(result);

        sayCongrats("Irfan", 90, 90, 50, 80, 79);

        sayHello();

        int resultFactorial = factorial(4);
        System.out.println(resultFactorial);
    }

    // This is method
    static void hello() {
        System.out.println("Hello, Irfan Yasin");
    }



    // Method Parameter
    static void sayHello(String firstName, String lastName){
        System.out.println("Halo, " + firstName +" "+ lastName);
    }



    // Method Return Value
    static int sum(int numb1, int numb2){
        var total = numb1 + numb2;
        return total;
    }


    // Method Variable Argument
    static void sayCongrats(String name, int... grade) {
        var totals = 0;
        for(int value : grade){
            totals += value;
        }

        float finalGrade = totals / grade.length;

        if(finalGrade >= 75){
            System.out.println("Selamat " + name + " Anda Lulus, Nilai : " + finalGrade);
        }else {
            System.out.println("Mohon maaf anda belum lulus");
        }
    }



    // Method Overloading (Bisa menduplikat nama method dg beda parameter)
    static void sayHello() {
        System.out.println("Ini method overloading");
    }


    // Recursive
    static int factorial(int value) {
       if(value == 1) {
           return 1;
       }else {
           return value * factorial(value - 1);
       }
    }
}

