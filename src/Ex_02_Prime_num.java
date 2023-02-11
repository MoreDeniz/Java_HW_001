// 2. Вывести все простые числа от 1 до 1000
import java.util.Scanner;
public class Ex_02_Prime_num {

    public static void main(String[] args) {
        boolean b = true;
            for (int prime = 2; prime <= 1000; prime++){
                for (int i = 2; i < prime; i++){
                    if (prime % i == 0){
                        b = false;
                        break;
                    }
                }
                if (b) System.out.printf("%d ", prime);
                else b = true;
            }
        }
    }

