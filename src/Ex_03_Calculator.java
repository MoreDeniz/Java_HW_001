// 3. Реализовать простой калькулятор

import java.util.Scanner;

public class Ex_03_Calculator {
    public static void main(String[] args) {
    double a;
    double b;
    double res = 0;
    char oper;
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    a = reader.nextDouble();
    b = reader.nextDouble();
    System.out.print("Enter an operator (+ - * /): ");
    oper = reader.next().charAt(0);
    switch(oper) {
        case '+': res = a + b;
        break;
        case '-': res = a - b;
            break;
        case '*': res = a * b;
            break;
        case '/':
            if (b == 0) {
                System.out.print("На 0 делить нельзя!!!");
                return;
            }
            res = a / b;
            break;
        default: System.out.println("Error! Enter correct operator");
            return;
    }
    System.out.printf("Result: "+ a + " " + oper + " " +  b + " = " + res);
    }
}
