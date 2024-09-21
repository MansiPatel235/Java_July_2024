package aug06;

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        MethodOverloadingDemo student=new MethodOverloadingDemo();
        System.out.println(student.studentInfo("Mansi"));
        System.out.println(student.studentInfo("Mansi", "mansipatel@gmail.com"));
        System.out.println(student.studentInfo("Mansi","mansipatel@gmail.com","123456"));
    }

    public String studentInfo(String name)
    {
        return ("Hello your name is: "+name);
    }

    public String studentInfo(String name, String email)
    {
        return ("Hello "+name +", Your email is: "+email);

    }

    public String studentInfo(String name, String email,String phone)
    {
        return ("Hello "+name+" your email is: "+email+ ", Your phone number is : "+phone);

    }

}
