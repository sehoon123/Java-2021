package object;

public class CalculatorDemo2 {
    public static void avg(int left, int right) {
        System.out.println((left + right)/2);
    }
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }

    public static void main(String[] args) {
        sum(10, 20);
        sum(15, 20);
        avg(10, 20);
    }
    
}
