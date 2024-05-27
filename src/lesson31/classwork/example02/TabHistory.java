package lesson31.classwork.example02;

import java.util.Stack;

public class TabHistory {

       private Stack<String> forwardStack;
       private Stack<String> backwardStack;
       private String currentPage;

    public String getCurrentPage() {
        return currentPage;
    }


    public TabHistory (String homePage){
        currentPage = homePage;
        forwardStack = new Stack<>();
        backwardStack = new Stack<>();
    }

    // назад / вперед методы

    public String goBack(){
        forwardStack.push(currentPage);
        if (backwardStack.isEmpty()){
            return null;
        }
        currentPage = backwardStack.pop();
        return currentPage;
    }

    public String goForward(){
        if (forwardStack.isEmpty()){
            return null;
        }
        backwardStack.push(currentPage);
        currentPage = forwardStack.pop();
        return currentPage;
    }

    public void goToPage(String url){
        forwardStack.clear();
        backwardStack.push(currentPage);
        currentPage = url;
    }

}
