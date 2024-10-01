package aug17;

public class Student {
    int rollNo;
    String firstName;
    String lastName;
    String email;

    public Student(int rollNo, String firstName, String lastName, String email) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
