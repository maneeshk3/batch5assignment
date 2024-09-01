public class Person {

    private String name;
    private int age;
    private String address;

    public Person(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public Person() {
    }
    public void displayInfo(){

        System.out.println( "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}');
    }
    public void setInfo(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAddult(int age) {
        if (age >= 18) {
            this.age = age;
            System.out.println("Yes the persion is addult");
            return true;
        } else {
            System.out.println("Person is not addult");
        }
        return false;
    }
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("Swaraj");
        person.setAge(26);
        person.setAddress("Pattamundai");

        System.out.println("\nUpdated Information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());

        person.displayInfo();
        person.isAddult(person.getAge());
    }

}
