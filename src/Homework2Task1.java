//1.Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"

import java.util.InputMismatchException;
import java.util.Scanner;
public class Homework2Task1 {
    public static void main(String[] args)  throws InputMismatchException {


        try {
            Scanner Input = new Scanner(System.in);
            System.out.println("Введите символ с1: ");
            char c1 = Input.next().charAt(0);
            System.out.println("Введите символ с2: ");
            char c2 = Input.next().charAt(0);
            System.out.println("Введите четное число N: ");
            int n = Input.nextInt();
            Input.close();
            printString(c1, c2, n);
        }

        catch (InputMismatchException e){
            System.out.println("Нужно вводить число!");
        }

    }
    private static void printString(char c1, char c2, int repeat) {
        if (repeat % 2 != 0 || repeat < 1){
            System.out.println("Должно было быть введено четное число, больше 0!");
        }
        else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < repeat/2; i++) {
                sb.append(c1);
                sb.append(c2);
                      }
            System.out.println(sb);
        }
        System.out.println();
    }

}



