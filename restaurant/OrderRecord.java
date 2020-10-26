package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class OrderRecord {
    private String name="用户";
    private int numOfPeople;
    private int no;
    private int price;
    private int tableNo;
    private String time;
    private int order[];

    public void setInf(String name, int no, int price, int tableNo, String time) {
        this.name = name;
        this.no = no;
        this.price = price;
        this.tableNo = tableNo;
        this.time = time;

    }

    public void delete() {

    }

    public void newOrder(int order[]) {
        this.order=order;

    }
    @Override
    public String toString() {
        return "OrderRecord{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", price=" + price +
                ", tableNo=" + tableNo +
                ", time='" + time + '\'' +
                '}';
    }

    public void makeMeal(int order[],int price[]){
        int total=0;
        for(int i=0;i<20;i++)
        {

            if(order[i]!=0)
            System.out.println(i+"号菜点了"+order[i]+"份");
            total+=price[i]*order[i];
        }
        System.out.println("共计消费"+total+"元");
    }

}
