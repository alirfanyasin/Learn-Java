public class Strings {
    public static void main(String[] args) {
        // Example
        String name = "Jhon Doe";
        System.out.println(name);

        // Length
        String location = "Jl. Anggrek No. 89";
        System.out.println(location.length());

        // String Method
        String text = "This is Text";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());


        // Finding Character
        String txt = "This 'character' in string";
        System.out.println(txt.indexOf("character"));


        // Concatenation
        String firstName = "Irfan";
        String lastName = "Yasin";
        System.out.println(firstName + " " + lastName); // Irfan Yasin
        System.out.println(firstName.concat(lastName)); // IrfanYasin


        // Number and String
        String x = "20";
        String y = "10";
        System.out.println(x + y); // 2010

        String x2 = "40";
        int y2 = 30;
        System.out.println(x2 + y2); // 4030


        // Special Character
        /*
            Escape Character            Result          Description
            -------------------------------------------------------
                    \'                    '             Single quote
                    \"                    "             Double quote
                    \\                    \             Backslash
                    \n                                  New line
                    \r                                  Carriage return
                    \t                                  Tab
                    \b                                  Backspace
                    \f                                  Form feed
        */
        // Example
        String textExample = "Hello \'World\'";
        System.out.println(textExample);


        String exampleText = "Hello World \nThis is text";
        System.out.println(exampleText);



    }
}
