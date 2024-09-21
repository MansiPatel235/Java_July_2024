package aug06;

public class DateDemo {

    int day;
    int month;
    int year;


    // default constructor
    DateDemo(){
        day = 6;
        month = 8;
        year = 2024;
    }

    // parameterized constructor

    DateDemo(int day, int month ){
        this(); // this() , to call a default constructor
        this.day = day;
        this.month = month;
    }

    public DateDemo(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // this



    public void displayDate(){
        System.out.println(day + " / " + month + "/ " + year);

    }

}
