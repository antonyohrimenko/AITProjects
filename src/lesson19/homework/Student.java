package lesson19.homework;

public class Student {

    // закрываем поля, чтобы не трогали руками =)
   private String first_name;
   private String last_name;
   private String university;
   private int age;
   private int perfomance = 0; // успеваемость

    public Student(String first_name, String last_name, int age, String university) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.university = university;
    }

    // напишем геттер и сеттер для примера. Например на поле университет
    public String getUniversity() {
        System.out.println("Your current university is: " + university);
        return "";
    }

    public void setUniversity(String university) {
        this.university = university;
        System.out.println("\nYou changed university to: " + university);
    }

    // доступ к методам на уровне пакета default для примера
    void getInfo() {
        System.out.println("I'am " + first_name + " " + last_name + ". " + "Age: " + age + ". " + "University: " + university);
    }
    void getPerfomance (){
        System.out.println("Your current perfomance: " + perfomance + " points!");
    }
    void passExam (){
        perfomance+= 5;
        System.out.println("+5 points for Gryffindor!");
    }







}
