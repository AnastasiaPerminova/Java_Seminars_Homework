// Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Homework3Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>((Arrays.asList(1, 1, 2, 3, 1, 5, 3, 5, 6, 6, 6, 9, 6, 7, 11, 11, 11, 7, 7, 9, 7)));
        OnlyEven(List);
        System.out.println(List);
    }
    public static void OnlyEven(List<Integer> source){
        int i = 0;
        while (i < source.size()){
            Integer element = source.get(i);
            if(element % 2 != 0 ){
                source.remove(i--);
            }
            i++;

        }
    }
}
