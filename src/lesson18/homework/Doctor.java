package lesson18.homework;

public class Doctor {

    private String first_name;
    private String last_name;
    private String specialisation;
    private String tel_number;
    private boolean avalible = true ;

    public Doctor(String first_name, String last_name, String specialisation, String tel_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.specialisation = specialisation;
        this.tel_number = tel_number;
    }

    void getInfo() {
        System.out.println("Dr. " + first_name + " " + last_name + ". " + "Specialisation: " + specialisation + ". " + "Tel: " + tel_number);
        ;
    }

    void chekUp() {
        System.out.println("What's bothering you? Take off your clothes");
    }

    void getAnamnesis (){
        System.out.println("Checking patient anamnesis....");
        // тут потом можно будет подгружать данные заполненные от пациента
        // например из списка
    }

    void notAvalible (){
        avalible = false;
        System.out.println("No available dates for new patients!");
    }

}
