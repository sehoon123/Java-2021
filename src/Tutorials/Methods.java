package Tutorials;

import java.util.Scanner;

public class Methods {
    public static void numbering(int i) {
        for (int j = 0; j < i; j++ ) {
            System.out.println(j);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numbering(n);
        sc.close();

    }
    
}
