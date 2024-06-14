package NGlesson29.classwork.CollectionSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOverview {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        list.add("qwerty");
        set.add("qwerty"); // добавляем элементы

        list.add("qwerty");
        set.add("qwerty"); // не добавится тк значение повторяющееся в сете. Добавляет только уникальные

        System.out.println(list.get(0));
//        System.out.println(set.get(0)); нельзя получить индекс элемента тк его нет.

        System.out.println(set.contains("qwerty")); // проверяет значение в сете. Есть там или нет
        // у листа тож еесть контаинс. Но выполняется значительно дольше.

        System.out.println(list);
        System.out.println(set);

        set.remove("qwerty");
        System.out.println(set);





    }
}
