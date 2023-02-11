// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
//    (произведение чисел от 1 до n)

import java.util.Scanner;
import java.util.Random;

public class Ex_01_Triangular_num {
    static int triang_num(int num){
        return (num * (num + 1)) / 2;
    }

    static int factorial(int num){
        if (num == 1) return 1;
        return num * factorial(num-1);
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int a = iScanner.nextInt();
        int tri_num = triang_num(a);
        int fact_num = factorial(a);
        System.out.printf("Triangular_num = %d\n", tri_num);
        System.out.printf("Factorial = %d\n", fact_num);
    }
}
