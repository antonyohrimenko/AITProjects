package lesson29.classwork.example01;

public class Box <T> {

    // Это будет обобщенный класс, пишем обобщенный тип

    private T contents = null;

    public void put(T o) {
        contents = o;
    }

    public T take() {
        T temp = contents;
        contents = null;
        return temp;
    }

    @Override
    public String toString() {
        return "In a box: " + contents;
    }
}
