public class TypeData {
    public static void main(String[] args) {
        // =====================================================
        // Example
        // =====================================================
        String name = "Irfan Yasin"; // this is type data String
        int age = 19; // this is type data number (int)
        float height = 180.00f; // this is type data decimal (float)
        char gender = 'L'; // this is type data character (char)
        boolean married = false; // this is type data boolean (true, false)

        // Print
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Height : " + height);
        System.out.println("Gender : " + gender);
        System.out.println("Married : " + married);


        // =====================================================
        // Type Data Number
        // =====================================================
        byte thisByte = 100; // (min = -127, max = 127, size = 1 byte);
        short thisShort = 1000; // (min = -32.768, max = 32.767, size = 2 bytes);
        int thisInt = 1000000; // (min = -2.147.483.648, max = 2.147.483.647, size = 4 bytes);
        long thisLong = 10000000; // (min = -9.22)
        long thisLong2 = 10000000L;
        float thisFloat = 80.34F;
        double thisDouble = 73.99;

        System.out.println("Byte : " + thisByte);
        System.out.println("Short : " + thisShort);
        System.out.println("Int : " + thisInt);
        System.out.println("Long : " + thisLong);
        System.out.println("Long 2 : " + thisLong2);
        System.out.println("Float : " + thisFloat);
        System.out.println("Double : " + thisDouble);

        // =====================================================
        // Type Data String
        // =====================================================
        String thisString = "This is type data string";
        System.out.println("String : " + thisString);

        // =====================================================
        // Type Data Character
        // =====================================================
        char thisCharacter = 'K';
        System.out.println("Character : " + thisCharacter);


        // =====================================================
        // Type Data Boolean
        // =====================================================
        boolean thisBoolean = true; // true or false
        System.out.println("Boolean : " + thisBoolean);
    }
}
