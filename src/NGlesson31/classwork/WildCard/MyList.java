package NGlesson31.classwork.WildCard;

import java.util.List;

public class MyList {

    public void printMyList(List<?> list){  // wildcard используется когда хз какой тип (любой)
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
