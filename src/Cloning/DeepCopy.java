package Cloning;

public class DeepCopy {
    public static class Student implements Cloneable {
        String name;
        int rollNo;
        Course course;
        Student(String name,int rollNo,Course course){
            this.name=name;
            this.rollNo= rollNo;
            this.course=course;
        }
        public Object clone() throws CloneNotSupportedException{
            Student cloned = (Student) super.clone();
            cloned.course = new Course(this.course.name,this.course.duration);
            return cloned;
        }

    }
    public static class Course{
        String name;
        int duration;//months
        Course(String name, int duration ){
            this.name=name;
            this.duration=duration;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Student obj = new Student("Sam",19,new Course("ML",6 ));
        Student clonedObj =(Student) obj.clone();
        obj.course.name="DeepLearning";
        obj.course.duration=3;//months
        System.out.println(clonedObj.course.name+" "+clonedObj.course.duration);
    }
}
