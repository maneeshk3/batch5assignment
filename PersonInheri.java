class PersonInheri{
    String name;
    int age;
    String gender;
    PersonInheri(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    void displayInfo(){
        System.out.println("Person Name: " + name);
        System.out.println("Person age: " + age);
        System.out.println("Person gender: " + gender);
    }
}
class Employee extends PersonInheri{
    int EmpId;
    String name;
    Employee(String name, int age, String gender, int EmpId){
        super(name,age,gender);
        this.name=name;
        this.EmpId=EmpId;
    }
        void displayInfo(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee age: " + age);
        System.out.println("Employee gender: " + gender);
        System.out.println("Employee Employee ID : " + EmpId);
    }
    void showEmployeeName(){
        System.out.println("Show Employee Name: " + this.name);
    }
}
class Manager extends Employee{
    String department;
    Manager(String name,int age,String gender, int EmpId, String department){
        super(name,age,gender,EmpId);
        this.department=department;
    }
     public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        PersonInheri person = new PersonInheri("Sonu",20,"Female");
        Employee emp = new Employee("Suriya",24,"Male",104);
        Manager manager = new Manager("Achu", 35, "Female", 101, "Sales");
        person.displayInfo();
        emp.displayInfo();
        emp.showEmployeeName();
        manager.displayInfo();
        manager.showEmployeeName();
    }
}
