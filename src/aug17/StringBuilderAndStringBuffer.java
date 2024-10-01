package aug17;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {


        // StringBuffer
        StringBuffer sb = new StringBuffer("Toronto");
        //System.out.println(sb);

        StringBuffer address = sb.append(" Canada"); // Toronto Canada

        System.out.println(sb);
        System.out.println(address);


        System.out.println(sb.reverse());

        StringBuilder stringBuilder = new StringBuilder("test");

        /*

//  insert, replace, reverse , append, capacity, charAt, length


         */

    }
}
