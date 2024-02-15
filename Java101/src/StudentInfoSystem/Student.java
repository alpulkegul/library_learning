//Project: Student Info System

package StudentInfoSystem;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    Course course4;
    Course course5;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3, Course course4, Course course5) {

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
        this.course5 = course5;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int note4, int note5){
        if (note1 >= 0 && note1 <=100)
            course1.note = note1;
        if (note2 >= 0 && note2 <=100)
            course2.note = note2;
        if (note3 >= 0 && note3 <=100)
            course3.note = note3;
        if (note4 >= 0 && note4 <=100)
            course4.note = note4;
        if (note5 >= 0 && note5 <=100)
            course5.note = note5;
    }
    void isPass(){
        this.avarage = (this.course1.note+this.course2.note+this.course3.note+this.course4.note+this.course5.note)/5.0;

        if (this.avarage>=55){
            System.out.print    ("Passed.");
            this.isPass = true;
        }else{
            System.out.print("Failed.");
            this.isPass = false;
        }

        printNote();
    }
    void printNote(){
        System.out.println(" " + name);
        System.out.println(" ");
        System.out.println(course1.name + " score\t\t:" + course1.note);
        System.out.println(course2.name + " score\t:" + course2.note);
        System.out.println(course3.name + " score\t:" + course3.note);
        System.out.println(course4.name + " score\t:" + course4.note);
        System.out.println(course5.name + " score\t:" + course5.note);
        System.out.println(" ");
        System.out.println("Your Avarage\t:" + this.avarage);
        System.out.println(" ");

    }



}
