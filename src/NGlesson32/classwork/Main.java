package NGlesson32.classwork;

public class Main {
    public static void main(String[] args) {

        // создаем 2 кнопочки
        Button cancelButton = new CancelButton(); // выбираем общий тип данных
        Button okButton = new OkButton();


        // создаем и реализовываем обьект за счет абстрактного класса
        // прямо тут прямо сразу. Обьект можно создать только один
        // создает обьект и мы этот класс выкидываем и не вспоминаем

        Button newButton = new Button() {   // можно заменить на лямбда выражение
            @Override
            public void onClick() {
                System.out.println("Вы нажали на новую кнопку");
            }
        };

        okButton.onClick();
        cancelButton.onClick();
        newButton.onClick();

        System.out.println(okButton.getClass());
        System.out.println(cancelButton.getClass());
        System.out.println(newButton.getClass());






    }
}
