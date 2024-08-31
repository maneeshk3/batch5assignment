public class Persion {

    private String name;
    private int age;
    private String address;

    public Persion(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public Persion() {
    }
    public void displayInfo(){

        System.out.println( "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}');
    }

    public static void main(String[] args) {
        Persion p=new Persion();
        p.name="swaraj";
        p.age=26;
        p.address="Pattamundai";
        p.displayInfo();
    }
}
