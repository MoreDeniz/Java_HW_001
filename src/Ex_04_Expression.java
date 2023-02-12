// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
// могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
// восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет.

import java.util.Scanner;

public class Ex_04_Expression {
    public static void main(String[] args) {
        int a_ed; int b_ed; int s_ed;
        int a_dec; int b_dec; int s_dec;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите двузначные числа для уравнения вида: a + b = s, заменяя некоторые цифры '?'\n");
        System.out.print("a = ");
        String a = reader.nextLine();
        System.out.print("b = ");
        String b = reader.nextLine();
        System.out.print("s = ");
        String s = reader.nextLine();
        System.out.printf(a + " + " + b + " = " + s );

        a_ed = Character.getNumericValue(a.charAt(1));
        b_ed = Character.getNumericValue(b.charAt(1));
        s_ed = Character.getNumericValue(s.charAt(1));
        a_dec = Character.getNumericValue(a.charAt(0));
        b_dec = Character.getNumericValue(b.charAt(0));
        s_dec = Character.getNumericValue(s.charAt(0));

        boolean flag = true;

        if (Character.isDigit(a.charAt(1)) && Character.isDigit(b.charAt(1))) {
            a_ed = Character.getNumericValue(a.charAt(1));
            b_ed = Character.getNumericValue(b.charAt(1));
            if (Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(b.charAt(1)) < 10)
                s_ed = Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(b.charAt(1));
            else {
                s_ed = Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(b.charAt(1)) - 10;
                s_dec = Character.getNumericValue(s.charAt(0)) + 1;
            }
        }

        else if (Character.isDigit(a.charAt(1)) && Character.isDigit(s.charAt(1))) {
            a_ed = Character.getNumericValue(a.charAt(1));
            s_ed = Character.getNumericValue(s.charAt(1));
            if (Character.getNumericValue(s.charAt(1)) - Character.getNumericValue(a.charAt(1)) < 0) {
                b_ed = Character.getNumericValue(s.charAt(1)) - Character.getNumericValue(a.charAt(1)) + 10;
                a_dec = Character.getNumericValue(s.charAt(0)) - Character.getNumericValue(b.charAt(0)) - 1;
            }
            else {
                b_ed = Character.getNumericValue(s.charAt(1)) - Character.getNumericValue(a.charAt(1));
            }
        }

        else if (Character.isDigit(b.charAt(1)) && Character.isDigit(s.charAt(1))) {
            s_ed = Character.getNumericValue(s.charAt(1));
            b_ed = Character.getNumericValue(b.charAt(1));
            if (Character.getNumericValue(s.charAt(1)) - Character.getNumericValue(b.charAt(1)) < 0) {
                a_ed = Character.getNumericValue(s.charAt(1)) - Character.getNumericValue(b.charAt(1)) + 10;
                b_dec = Character.getNumericValue(s.charAt(0)) - Character.getNumericValue(a.charAt(0)) - 1;
            }
            else {
                a_ed = Character.getNumericValue(s.charAt(1)) - Character.getNumericValue(b.charAt(1));
            }
        }

        if (Character.isDigit(a.charAt(0)) && Character.isDigit(b.charAt(0))) {
            a_dec = Character.getNumericValue(a.charAt(0));
            b_dec = Character.getNumericValue(b.charAt(0));
            if (Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(b.charAt(0)) < 10)
                s_dec = Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(b.charAt(0));
            else {
                flag = false;
            }
        }

        else if (Character.isDigit(a.charAt(0)) && Character.isDigit(s.charAt(0))) {
            a_dec = Character.getNumericValue(a.charAt(0));
            s_dec = Character.getNumericValue(s.charAt(0));
            if (Character.getNumericValue(s.charAt(0)) - Character.getNumericValue(a.charAt(0)) < 0) {
                flag = false;
            }
            else {
                if(a_ed + b_ed > 9){
                    b_dec = Character.getNumericValue(s.charAt(0)) - Character.getNumericValue(a.charAt(0)) - 1;
                }
                else b_dec = Character.getNumericValue(s.charAt(0)) - Character.getNumericValue(a.charAt(0));
            }
        }

        else if (Character.isDigit(b.charAt(0)) && Character.isDigit(s.charAt(0))) {
            s_dec = Character.getNumericValue(s.charAt(0));
            b_dec = Character.getNumericValue(b.charAt(0));
            if (Character.getNumericValue(s.charAt(0)) - Character.getNumericValue(b.charAt(0)) < 0) {
                flag = false;
            }
            else {
                if(a_ed + b_ed > 9){
                    a_dec = Character.getNumericValue(s.charAt(0)) - Character.getNumericValue(b.charAt(0)) - 1;
                    }
                else a_dec = Character.getNumericValue(s.charAt(0)) - Character.getNumericValue(b.charAt(0));
            }
        }

        if (flag) System.out.println("\n" + a_dec + a_ed + " + " + b_dec + b_ed + " = " + s_dec + s_ed);
        else System.out.println("\n Решений нет!");
    }
}
