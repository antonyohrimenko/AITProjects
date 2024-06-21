package NGlesson31.classwork.WildCard;

import java.util.ArrayList;
import java.util.List;

public class MyListExampleMain {
    public static void main(String[] args) {

        MyList myList = new MyList();
        List<String> list = new ArrayList<>();

        list.add("qwe");
        list.add("abc");
        list.add("def");
        list.add("asd");


        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1123);
        integerList.add(1233);

        myList.printMyList(list); // метод печатает и стринговые листы
        myList.printMyList(integerList); // метод печатает и интовые листы

    }
}
