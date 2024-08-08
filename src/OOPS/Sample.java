package OOPS;

public class Sample {
    public static void main(String[] args) {
        Student Student1 = new Student(54, "Farzana", 95.2f);
        System.out.println(Student1.marks);
    }
}

class Student{
    int rno;
    String name;
    float marks;


    Student(){
        this.rno = 14;
        this.name = "Mahnoor";
        this.marks = 87.5f;
    }

    Student( int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
