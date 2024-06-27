package NGlesson32.homework;

import java.io.Serializable;

public class TripleService {
    public <T extends Comparable<T>, V extends Animal & Serializable, K extends Number> void printTripleInfo(Triple<T, V, K> triple) {
        System.out.println("First value: " + triple.getFirst());
        System.out.println("Second value: " + triple.getSecond().getName());
        System.out.println("Third value: " + triple.getThird());
        triple.printClassNames();
    }
}

