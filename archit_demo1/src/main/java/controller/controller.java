package controller;

import domain.User;
import domain.UserFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class controller {

    private User user = null;

    @RequestMapping("/toCreate")
    public String toCreate(){
        return "create";
    }

    @RequestMapping("/toLogIn")
    public String toLogIn(){
        return "login";
    }

    @RequestMapping("/create")
    public String createUser(String type, Integer id, String name, Integer password, String safeAns) {
        //设置注册用户类型
        user = UserFactory.createUser(type);
        user.register(id,password,name,safeAns);
        //简单工厂设计模式的注册用户
        System.out.println(user);
        //返回主頁
        return "create_success";
    }

    @RequestMapping("/login")
    public String logIn(Integer id, Integer password) {
        if (id == user.getUserId() && password == user.getPassword()){
            return "login_success";
        }
        else {
            //返回主頁
            return "redirect:index.jsp";
        }
    }

    @RequestMapping("Back")
    public String back(){
        return "redirect:index.jsp";
    }


}
