package abstractclass;

abstract class A {
    //추상 메소드는 청사진임 구체화되있으면 안됨.
    public abstract int b();
    public void d() {
        System.out.println("world");
    }
}

class B extends A{
    public int b() {
        return 1;
    }

}
public class AbstractDemo {
    public static void main(String[] args) {
        // A obj = new A();
        B obj = new B();
        System.out.println(obj.b());
        obj.d();
    }
    
}
