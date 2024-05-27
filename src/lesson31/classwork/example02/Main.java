package lesson31.classwork.example02;

public class Main {

    /*
https://www.google.com/
https://www.google.com/search?q=java
https://www.w3schools.com/java/
https://www.w3schools.com/java/java_oop.asp
     */

    public static void main(String[] args) {

        TabHistory tabHistory = new TabHistory("https://www.google.com/");
        tabHistory.goToPage("https://www.google.com/search?q=java");
        tabHistory.goToPage("https://www.w3schools.com/java/");
        tabHistory.goToPage("https://www.w3schools.com/java/java_oop.asp");
        System.out.println(tabHistory.getCurrentPage());
        tabHistory.goBack();
        tabHistory.goBack();
        System.out.println(tabHistory.getCurrentPage());
        tabHistory.goForward();
        System.out.println(tabHistory.getCurrentPage());


    }




}
