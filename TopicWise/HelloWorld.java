class HelloWorld {
    public static void main(String[] args) {
        // In Java, every application begins with a class definition.
        // name of the class should match the filename in Java.

        System.out.println("Hello world");
        // prints the text Hello, World! to standard output (your screen).

        /*
         * To compile the file, open your terminal and type
         * 
         * javac filename.java
         * 
         * To run the generated class file, use
         * 
         * java filename
         */

        int age; // valid name and good practice
        int _age; // valid but bad practice
        int $age; // valid but bad practice
        /*
         * Variable names cannot start with numbers. For example,
         * 
         * 
         * int 1age; // invalid variables
         * 
         */
        // octal
        int octalNumber = 027;

        // decimal
        int decNumber = 34;

        int hexNumber = 0x2F; // 0x represents hexadecimal
        int binNumber = 0b10010; // 0b represents binary
        System.out.println(hexNumber);
        System.out.println(binNumber);

        // 3.445*10^2
        double myDoubleScientific = 3.445e2;
        System.out.println(myDoubleScientific); // prints 344.5

        String str1 = "Java Programming";
        System.out.println(str1);

    }
}