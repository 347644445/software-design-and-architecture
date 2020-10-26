package restaurant;

public class Run {
    public static void main(String[] args) {

        User zhangsan=null;
        String type="customer";                 //设置注册用户类型
        zhangsan = UserFactory.createUser(type);
        zhangsan.register(100000,"123456","张三","abc");
        //简单工厂设计模式的注册用户
        System.out.println(zhangsan);

        int order[]={0,0,0,0,0,0,0,0,0,0,
                     0,0,0,0,0,0,0,0,0,0};//初始化20种餐品点餐数量都为零。
        int price[]={1,2,3,4,5,6,7,8,9,10,
                     11,12,13,14,15,16,17,18,19,20};//给每个菜品的价格设置一个初始值。

        RestaurantFacade restaurantFacade=null;
        restaurantFacade=new RestaurantFacade(zhangsan);
        order[3]=1;order[4]=1;
        restaurantFacade.request(3,order,price);


    }
}
