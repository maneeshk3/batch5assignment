public class Main {
    public static void main(String[] args) {
        // Primitive type
        int age = 27;
        System.out.println("Original age: " + age);
        updateAge(age);
        System.out.println("Updated age: " + age);

        // Non-primitive type
        Person person = new Person("Gauri", 29);
        System.out.println("Original person: " + person);
        updatePerson(person);
        System.out.println("Updated person: " + person);
    }

    public static void updateAge(int age) {
        age = 35;
        System.out.println("Updated age inside method: " + age);
    }

    public static void updatePerson(Person person) {
        person.setName("Mrunal");
        person.setAge(40);
        System.out.println("Updated person inside method: " + person);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return name + ", " + age;
    }
}
