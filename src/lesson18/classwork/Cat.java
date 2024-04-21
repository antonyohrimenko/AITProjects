package lesson18.classwork;


// Введение в ООП
// Наследование, полиморфизм, инкампуляция + абстракция

public class Cat {

    String name;
    String color;
    int age;


    // конструктор класса (всегда совпадает с именем класса!
    public Cat (){
        // тут поля
    }

    // перегрузка конструктора
    public Cat (String catName){
        name = catName;
    }

    public Cat (String catName, String color){
        name = catName;
        // ссылка на текущий экземпляр класса
        // обращаемся к обьекту, к его полю, на котором вызван наш конструктор
        // используется внутри класса для ссылки на текущий обьект (его полям)
        this.color = color;
    }

    public Cat (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;

        // можно сделать через другой конструктор
        // this (name, color); - который писали ранее
    }


    public void sleep (){
        System.out.println("Я сплю, не тревожить!");
    }

    void run(){
        System.out.println("Ран форест ран!");
    }

    void sayMeow (){
        System.out.println("Маааау!");
    }

    public void whoAmI (){
        System.out.println("я котик " + name + ", возраст " + age + ", окрас " + color);
    }

}
