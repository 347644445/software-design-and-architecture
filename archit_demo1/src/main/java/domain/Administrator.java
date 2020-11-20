package domain;

public class Administrator extends User {
    private int manageLevel;

    public void findSeat(int numOfPeople) {
        System.out.println("成功找到了一张"+numOfPeople+"人的桌子");
    }

    public void openDesk() {

    }
}
