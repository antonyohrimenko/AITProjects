package lesson22.homework.Task01;


public class Main {
    public static void main(String[] args) {

        // +++++++++++++  Это АССОЦИАЦИЯ ОБЬЕКТОВ (АГРЕГАЦИЯ)  ( +++++++++++++

        // Создаем телевизор
        Television tv = new Television(50, 100); // Устанавливаем частоту 50

        // Создаем пульт управления
        RemoteControl remote = new RemoteControl(50); // Устанавливаем частоту пульта такую же как у телевизора

        // Переключаем каналы
        remote.switchChannelForward(tv); // Переключаем на "следующий канал" при выключенном телеке
        System.out.println("Current channel: " + tv.getCurrentChannel()); // 1

        remote.switchToChannel(tv, 5); // Тыкаем на пульте кнопку 5
        System.out.println("Current channel: " + tv.getCurrentChannel()); // 5

        remote.switchChannelForward(tv); // Переключаем на предыдущий канал
        System.out.println("Current channel: " + tv.getCurrentChannel()); // 4

        System.out.println();
        System.out.println("====================================================");

        remote.switchToChannel(tv, 100);
        System.out.println("Current channel: " + tv.getCurrentChannel());
        remote.switchChannelForward(tv); // должен перейти на 1ый
        System.out.println("Current channel: " + tv.getCurrentChannel());
        System.out.println();

        // сейчас канал 1ый
        remote.switchChannelBack(tv); // должен уйти на максимальный, на 100ый
        System.out.println("Current channel: " + tv.getCurrentChannel());
    }
}
