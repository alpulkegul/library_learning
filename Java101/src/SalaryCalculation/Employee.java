package SalaryCalculation;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours,int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax() {
        double taxAmount = 0.0;
        if (this.salary > 1000) {
            taxAmount = this.salary * 0.03;
        }
        return taxAmount;
    }

    double bonus() {
        double bonusAmount = 0;
        if(this.workHours > 40){
            bonusAmount = (this.workHours - 40) * 30;
        }
        return bonusAmount;
    }

    double raiseSalary() {
        double raise = 0.0;
        if (2021 - hireYear < 10) {
            raise = (int) this.salary * 0.05;
        } else if (((2021 - hireYear) < 9) && ((2021 - hireYear) < 20)) {
            raise = (int) (this.salary) * 0.1;

        } else if ((2021 - hireYear) > 19) {
            raise = (int) (this.salary) * 0.15;
        }
        return raise;
    }

     void String(){
        double salaryTaxBonus = this.salary-tax()+bonus();
        double totalSalary = salaryTaxBonus+raiseSalary();

        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary + "$");
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + tax() + "$");
        System.out.println("Bonus: " + bonus() + "$");
        System.out.println("Salary Increment: " + raiseSalary() + "$");
        System.out.println("Salary Includes Tax & Bonus: " + salaryTaxBonus + "$");
        System.out.println("Total Salary: " + totalSalary + "$");

    }
}
