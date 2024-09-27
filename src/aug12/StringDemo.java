package aug12;

public class StringDemo {
    public static void main(String[] args) {
        // String literal
        String name1 = "Pragra"; // string constant pool
        String name2 = new String("Pragra"); // new String object
        String name3 = "Pragra";
        String name4 = "Abc";


        System.out.println(name1.equals(name2)); // true
        System.out.println(name2 == name3); // true
        System.out.println(name1 == name4); // false
        System.out.println(name1 == name3); // true

        /*
        String comparison...

        ==       ----- reference as well

        .equals   -- content comparison



// read about string memory management ...

         */

    }
}
