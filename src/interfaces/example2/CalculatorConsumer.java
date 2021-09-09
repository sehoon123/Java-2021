package interfaces.example2;

class CalculatorDummy implements Calculatable{
    int first, second, third;
    public void setOprands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }


    public int sum() {
        return (this.first + this.second + this.third);
    }


    public int avg() {
        return (sum()/3);
    }
    
}

public class CalculatorConsumer {
    public static void main(String[] args) {
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10, 20, 30);
        int a = c.sum();
        int b = c.avg();
        System.out.printf("%d %d\n", a, b);
    }
    
}
