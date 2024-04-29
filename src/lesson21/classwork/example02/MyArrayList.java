package lesson21.classwork.example02;

public class MyArrayList {

    // Список (массив)

    private String[] array;
    private int size;

    public MyArrayList(int initialSize) {
        this.size = initialSize;
        array = new String[size];
    }

    public MyArrayList() {
        this(0);
    }

    public int getSize() {
        return this.size;
    }

    // получаем значение
    public String get(int index) {
        return array[index];
    }

    // задаем значение элемента
    public void set(int index, String value) {
        array[index] = value;
    }

    // вернуть индекс значниея value
    public int indexOf(String value) {

        for (int i = 0; i < size; i++) {  // array.lenght
            if (array[i].equalsIgnoreCase(value)) {
                return i;
            }
        }
        return -1;
    }

    // содержится ли value в списке
    public boolean contains(String value) {
        return indexOf(value) != -1;
    }

    public void resize(int newSize) {
        String[] temp = new String[newSize];
        int minSize = size < newSize ? size : newSize; // Math.min (...,,....)

        for (int i = 0; i < minSize; i++) {
            temp[i] = array[i];
        }

        array = temp;
        size = newSize;
    }

    // метод для добавляения нового элемента

    public void add(String value) {
        if (size + 1 > array.length) {

            // меняем размер массива
            resize(size + 1);
            array[size - 1] = value;
        } else {
            // вставляем элемент по индексу после последнего и размер увеличиваем
            array[size] = value;
            size++;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    // доп задание. Написать метод add(String value, int index), который добавляет элемент по индексу

    public void add(String value, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        resize(size + 1);
        // Сдвигаем элементы вправо, начиная с последнего до индекса index
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }


}
