package restaurant;

public class User {
    private int userId;
    private String password;
    private String name;
    private String safeAnswer;

    public void findPassword() {

    }

    public void register(int userId,String password,String name,String safeAnswer) {

            this.userId = userId;
            this.password = password;
            this.name = name;
            this.safeAnswer = safeAnswer;

    }

    public void verifyLogin() {

    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", safeAnswer='" + safeAnswer + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSafeAnswer() {
        return safeAnswer;
    }
}
