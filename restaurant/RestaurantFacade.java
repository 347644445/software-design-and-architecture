package restaurant;

import java.Custom;

public class RestaurantFacade {
    private User user;
    private Administrator administrator;
    private OrderRecord orderRecord;

    public RestaurantFacade(User user) {
        this.user = user;
        this.administrator = new Administrator();
        this.orderRecord = new OrderRecord();
    }

    public void request(int numOfPeople,int order[],int price[]){
        System.out.println("亲爱的"+user.getName()+"欢迎您前来用餐。");
        administrator.findSeat(numOfPeople);
        orderRecord.makeMeal(order,price);
        System.out.println("祝您用餐愉快！");


    }
}
