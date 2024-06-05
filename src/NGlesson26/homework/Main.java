package NGlesson26.homework;

//1) Создать класс человек (поля придумайте сами). Создайте тип пользователя - enum: USER, ADMIN.
// Тип пользователя - поле в классе человек
//2) Создать интерфейс Фильтр. в нем метод, который принимает строку (веб-адрес, к которому подлкючается человек)
// и тип пользователя (enum). Отдает boolean значение, пропускает ли он человека к ресурсу или нет.
//3)реализуйте интерфейс таким образом:
//4)Если это админ, то досту разрещен к любому сайту
//5) Если это пользователь, то только для тех сайтов, которые начинаются на "http://web-for-user" ему доступ разрещен
//6) Самостоятельно создайте пару пользователей и попробуйте проверить, к каким сайтам у них есть доступ
//7*) Добавьте в enum поле, обозначающее название роли пользователя на русском языке

public class Main {

    public static void main(String[] args) {

        Person admin = new Person("Anton", 35, UserType.ADMIN);
        Person user = new Person("Unknown Capybara", 25, UserType.USER);

        AccessFilter filter = new AccessFilter();

        String[] urls = {
                "http://web-for-user.com",
                "http://web-for-admin.com",
                "http://web-for-user/page",
                "http://another-site.com"
        };

        for (String url : urls) {
            System.out.println("Checking access for " + admin.getName() + " to " + url + ": " + filter.isAllowed(url, admin.getUserType()));
            System.out.println("Checking access for " + user.getName() + " to " + url + ": " + filter.isAllowed(url, user.getUserType()));
        }
    }
}
