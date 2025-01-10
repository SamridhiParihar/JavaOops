package Lec1;

public class a1 {
    public static void main(String[] args) {
        Student sam; // declare a reference to object but object isn't created yet
        //sam = new Student(); // dynamically allocates memory and returns a reference to it
    }
}
class Student {
    int roll_no;
    String name;
    float marks;
    Student(int roll_no, float marks, String name){
        this.roll_no=roll_no;
        this.name=name;
        this.marks=marks;
    }
}
