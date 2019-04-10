import ru.websumple.Controller.API;
import ru.websumple.Controller.UserRestController;

public class Main {
    public static void main(String[] args) {
        API controller = new UserRestController();
        System.out.println(controller.getUserJson(1));
//        System.out.println(controller.getUserJsonAll());
    }
}
