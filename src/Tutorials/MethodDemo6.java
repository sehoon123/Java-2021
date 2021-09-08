package Tutorials;

import java.util.Scanner;

public class MethodDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int init = sc.nextInt();
        int last = sc.nextInt();
        System.out.println(numbering(init, last));
        sc.close();

    }

    public static String numbering(int init, int last) {
        int i = init;
        String output = "";
        while (i < last) {
            output += i;
            i++;
        }
        return output;
    }
    
}
