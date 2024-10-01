package aug17;

public class ReverseString {
    public static void main(String[] args) {
        String originalStr = "Pragra";
        String originalStr2="Aaron & Arman";
        System.out.println(reverseString(originalStr));
        System.out.println(reverseString(originalStr2));
    }

    public static String reverseString(String s)
    {
        String reveseString="";
        for (int i=0;i<s.length();i++){
            reveseString=s.charAt(i)+reveseString;
        }
        return reveseString;
    }

}
