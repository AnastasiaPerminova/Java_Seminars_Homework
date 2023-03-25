
import java.util.*;

public class HomeWork5 {

    /**
     * Есть текст. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
     * проснись
     *
     * и
     * ты
     * Еще
     * день друг Пора
     * ..
     *
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String text1 = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
//        collectStats(text1);

        System.out.printf("Введите текст: ");
        String text = scanner.nextLine();
        scanner.close();
        collectStats(text);


    }

    static void collectStats(String text) {

        String charsToRemove = ".,:?*();!-_";
        for (char c : charsToRemove.toCharArray()) {
            text = text.replace(String.valueOf(c), "");
        }

        text = text.toLowerCase();
        String[] split = text.split(" ");

        Map<Integer, List<String>> stats = new HashMap<>();

        for (int i = 0; i < split.length; i++) {

            if (stats.containsKey(split[i].length())) {
                stats.get(split[i].length()).add(split[i]);
            } else {
                ArrayList<String> word = new ArrayList<>();
                word.add(split[i]);
                stats.put(split[i].length(), word);
            }
        }

        for (int key : stats.keySet()) {
            System.out.println(key + " : " + stats.get(key).toString().replaceAll("^\\[|\\]$", ""));
        }
    }
}
