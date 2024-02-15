//Project: Student Info System

package StudentInfoSystem;

public class main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Andrev Komanchi","+1555986748","Physics");
        Teacher t2 = new Teacher("John Ryzek","+1686516846","Chemistry");
        Teacher t3 = new Teacher("Emanuel Tara","+1684684354","History");
        Teacher t4 = new Teacher("Linda Swech","+1654651554","Math");
        Teacher t5 = new Teacher("Erva Merlin","+1684484625","Biology");

        Course math = new Course("Math","101","Math");
        math.addTeacher(t4);
        Course physics = new Course("Physics","101","Physics");
        physics.addTeacher(t1);
        Course chemistry = new Course("Chemistry","101","Chemistry");
        chemistry.addTeacher(t2);
        Course history = new Course("History","101","History");
        history.addTeacher(t3);
        Course biology = new Course("Biology","101","Biology");
        biology.addTeacher(t5);

        Student s1 = new Student("Bryan Zack","654","1",math,physics,chemistry,history,biology);
        s1.addBulkExamNote(100,50,20,50,60);
        s1.isPass();
        Student s2 = new Student("Friedrich Salaman","456","3",math,physics,chemistry,history,biology);
        s2.addBulkExamNote(60,20,100,55,92);
        s2.isPass();
        Student s3 = new Student("Pirlo Santino", "546", "2", math, physics, chemistry, history, biology);
        s3.addBulkExamNote(65,65,98,32,98);
        s3.isPass();
        Student s4 = new Student("John Crypton", "465", "1", math, physics, chemistry, history, biology);
        s4.addBulkExamNote(65,87,98,15,36);
        s4.isPass();
        Student s5 = new Student("Grey Soul","564","4",math,physics,chemistry,history,biology);
        s5.addBulkExamNote(65,15,2,36,100);
        s5.isPass();
    }




}
