class Example {
    private int value;

    public Example(int value) {
        this.value = value;
    }

    public void modifyValue(int newValue) {
        this.value = newValue; // Modify the object's internal state
    }

    public int getValue() {
        return this.value;
    }
}

public class CallByValueAndReference {
    public static void main(String[] args) {
        // Demonstrating call by value with primitive data type
        int num = 10;
        System.out.println("Before method call: num = " + num);
        modifyPrimitive(num);
        System.out.println("After method call: num = " + num); // num remains unchanged

        // Demonstrating call by reference with non-primitive data type
        Example obj = new Example(20);
        System.out.println("Before method call: obj.value = " + obj.getValue());
        modifyObject(obj);
        System.out.println("After method call: obj.value = " + obj.getValue()); // obj.value changes
    }

    public static void modifyPrimitive(int n) {
        n = 50; // This change will not affect the original variable
    }

    public static void modifyObject(Example ex) {
        ex.modifyValue(100); // This changes the internal state of the object
    }
}
