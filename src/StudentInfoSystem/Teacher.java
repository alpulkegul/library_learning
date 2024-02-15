//Project: Student Info System

package StudentInfoSystem;

public class Teacher {
    String name;
    String mpno;
    String branch;
    Teacher (String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("Name\t\t: \t" + this.name );
        System.out.println("Mobile No\t: \t" + this.mpno );
        System.out.println("Branch\t\t: \t" + this.branch );
    }



}
