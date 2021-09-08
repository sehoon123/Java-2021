package Inheritance.example1;

class Calc {
    int left, right;
    int third = 0;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    
    public void setOprands(int left, int right, int third) {
        this.setOprands(left, right);
        // this.left = left;
        // this.right = right;
        this.third = third;
    }

    public Calc (int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right+ this.third);
    }
    public void avg() {
        System.out.println((this.left + this.right+ this.third) /2);
    }
}


class SubstractCalc extends Calc {
    public SubstractCalc(int left, int right) {
        super(left, right);
    }
    
    //override
    public void sum() {
        System.out.println("The Result is "+ (this.left + this.right));
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo1 {
    public static void main(String[] args) {
        SubstractCalc c1 = new SubstractCalc(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();


    }
    
}
