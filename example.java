import java.util.*;
class example
{
    int a = 2;
    int b =10;
    void Valmodify(int b){
        b = b+2;
    }
    void Refmodify(example obj1){
        a = a+2;
    }
    public static void main(String args[]){
        example obj = new example();
        System.out.println("Before passing CallByValue : " + obj.b);
        obj.Valmodify(10);
        System.out.println("After passing CallByValue : " + obj.b);
        System.out.println("Before passing CallByRef : "+ obj.a);
        obj.Refmodify(obj);
        System.out.println("After passing CallByRef : " + obj.a);
    }
  
}
