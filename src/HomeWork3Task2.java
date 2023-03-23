import java.util.ArrayList;
import java.util.List;

//Дан список ArrayList<String>. Удалить из него все строки, которые являются числами.
// Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
// ["string", "s", "my_value"]

public class HomeWork3Task2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(list);
        OnlyString(list);
        System.out.println(list);

    }

    public static void OnlyString(ArrayList<String> source) {

        int i = 0;
        while (i < source.size()) {
            String element = source.get(i);
            try {
                Integer.parseInt(element);
                source.remove(i--);
            }
            catch (NumberFormatException numberFormatException) {
                i++;
            }
        }
    }
}
