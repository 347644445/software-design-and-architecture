package restaurant;

public class UserFactory {
    public static User createUser(String type) {

        User user=null;
        // 判断并且确认将返回的对象

        switch (type) {
            case "customer":
                user=new Customer();
                break;
            case "administrator":
                user=new Administrator();
                break;
            default:
                break;
        }

        return user;

    }
}
