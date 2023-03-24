import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
//
//Принимает от пользователя строку вида text~num
//
//Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//
//Если введено print~num, выводит строку из позиции num в связном списке.
//
//Если введено exit, завершаем программу
public class HomeWork4 {
    public static void main(String[] args) {

        ArrayList<String> List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку вида text~num, чтобы сохранить text на позицию num.\n" +
                "Для вывода позиции num введите print~num.\nДля завершения введите exit.\nВведите: ");

        while (true) {
            String input = sc.nextLine();

            if (input.contains("~")) {
                String[] split = input.split("~");
                try {
                    int index = Integer.parseInt(split[1]);

                    if (split[0].toLowerCase().equals("print")) {
                        try {
                            System.out.println(List.get(index));
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Данное значение не внесено.");
                        }
                    }

                    if (split[0].toLowerCase().equals("exit")) {
                        break;
                    }
                    else {
                        try {
                            List.set(index, split[0]);
                        } catch (IndexOutOfBoundsException e) {
                            while (List.size() <= index) {
                                List.add(null);
                            }
                            List.set(index, split[0]);
                        }
                    }

                } catch (NumberFormatException numberFormatException) {
                    System.out.println("\u001B[31mОшибка ввода.\u001B[0m\nВводимая строка должна быть вида text~num.\n" +
                            "Для вывода позиции num введите print~num.\nДля завершения введите exit.\nВведите: ");
                }
            }
            else {
                if (input.toLowerCase().equals("exit")) {
                    break;
                }
                else {
                    System.out.println("\u001B[31mОшибка ввода.\u001B[0m\nВводимая строка должна быть вида text~num.\n" +
                            "Для вывода позиции num введите print~num.\nДля завершения введите exit.\nВведите: ");
                }
            }
        }
    }
}