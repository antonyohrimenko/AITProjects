package lesson29.classwork.example03;

import java.util.Iterator;

public class MyArrayList <T> implements Iterable <T> {
    private Object[] array;

    private int size;

    public MyArrayList(int initialSize) {
        size = initialSize;
        array = new Object[size];
    }

    public MyArrayList() {
        this(0);
    }

    public int getSize() {
        return size;
    }

    // получить элемент массива
    public T get(int index) {
        return (T) array[index];
    }
    // задать значение элемента массива
    public void set(int index, T value) {
        array[index] = value;
    }

    // вернуть индекс значения value
    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // содержится ли value в списке?
    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    public void resize(int newSize) {
        // создаем новый массив нужного размера
        Object[] temp = new Object[newSize];

        // Math.min - выбирает минимальное из двух переданных значений
        // выбираем меньший из размеров
        int minSize = Math.min(size, newSize);

        // копируем элементы из старого массива в новый
        for (int i = 0; i < minSize; i++) {
            temp[i] = array[i];
        }

        // меняем ссылку и сохраненный размер массива
        array = temp;
        size = newSize;
    }

    public void add(T value) {
        if (size + 1 > array.length) {
            // меняем размер массива
            resize(size + 1);
            // отнимаем 1 потому что в resize уже изменили переменную size
            array[size - 1] = value;
        } else {
            // вставляем элемент по индексу размер (после последнего)
            array[size] = value;
            // размер увеличиваем
            size++;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(array);
    }

    private class MyIterator <T> implements Iterator<T>{

        private Object[] array;
        private int current;

        public MyIterator(Object[] array) {
            this.array = array;
            current = 0;
        }

        @Override
        public boolean hasNext() {
            return current < array.length;
        }

        @Override
        public T next() {
            return (T) array[current++];
        }
    }
}

