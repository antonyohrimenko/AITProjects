package lesson30.classwork.example03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collection;


public class Main01 {

    public static List<Character> diff(Collection<Character> a, Collection<Character> b)
    {
        List<Character> list = new ArrayList<>();

        for (char ch : a){
            if (!b.contains(ch)){
                list.add(ch);
            }
        }
        for (char ch : b){
            if (!a.contains(ch)){
                list.add(ch);
            }
        }
        list.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.compare(o1, o2);
            }
    });
        return list;
    }

    public static void main(String[] args) {

        // List<Character> diff(Collection<Character> a, Collection<Character> b)

        System.out.println(diff(List.of('a','a','c','d'), List.of('e','a' ,'c','d')));


    }
}
