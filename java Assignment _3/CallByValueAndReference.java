public class CallByValueAndReference {

    // Method to modify a primitive
    public static void modifyPrimitive(int num) {
        num = 10; // This change does not affect the original variable
    }

    // Method to modify an object
    public static void modifyObject(Person p) {
        p.setName("Changed Name"); // This change affects the original object
    }

    public static void main(String[] args) {
        int x = 5;
        modifyPrimitive(x);
        System.out.println("Value of x after modification: " + x); // x is still 5

        Person person = new Person("Original Name", 25);
        modifyObject(person);
        System.out.println("Person's name after modification: " + person.getName()); // Name is changed
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}