public class Overloading11 {

    String language;

    // constructor with no parameter
    Overloading11() {
        this.language = "Java";
    }

    // constructor with a single parameter
    Overloading11(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Programming Langauage: " + this.language);
    }

    public static void main(String[] args) {

        // call constructor with no parameter
        Overloading11 obj1 = new Overloading11();

        // call constructor with a single parameter
        Overloading11 obj2 = new Overloading11("Python");

        obj1.getName();
        obj2.getName();
    }
}
