package lesson22.classwork.example01;

public class MyArrayList {
    private OrderDetails[] array;

    private int size;

    public MyArrayList(int initialSize) {
        size = initialSize;
        array = new OrderDetails[size];
    }

    public MyArrayList() {
        this(0);
    }

    public int getSize() {
        return size;
    }

    // получить элемент массива
    public OrderDetails get(int index) {
        return array[index];
    }
    // задать значение элемента массива
    public void set(int index, OrderDetails value) {
        array[index] = value;
    }

    // вернуть индекс значения value
    public int indexOf(OrderDetails value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // содержится ли value в списке?
    public boolean contains(OrderDetails value) {
        return indexOf(value) != -1;
    }

    public void resize(int newSize) {
        // создаем новый массив нужного размера
        OrderDetails[] temp = new OrderDetails[newSize];

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

    public void add(OrderDetails value) {
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

    // Доп задание: написать метод add(String value, int index), который добавляет элемент по индексу

}










