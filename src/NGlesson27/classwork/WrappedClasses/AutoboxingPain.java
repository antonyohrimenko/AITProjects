package NGlesson27.classwork.WrappedClasses;

public class AutoboxingPain {
    public static void main(String[] args) {

        Integer a = null;

        int b = (a != null) ? a : 0; // типовая конструкция, чтобы не падало при nullPE
        System.out.println(b);

    }
}
