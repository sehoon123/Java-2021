package object;

class Calculator {
    int left, right;

    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }
    
}
public class Calculator3Demo {

    public static void main(String[] args) {
        Calculator c1 = new Calculator(1, 2);
        c1.sum();
        c1.avg();
    }
    
    
}
