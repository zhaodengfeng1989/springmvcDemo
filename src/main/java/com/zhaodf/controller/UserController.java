package com.zhaodf.controller;

import com.zhaodf.model.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

//方法一：使用注解的形式，访问地址是：/user/queryUsers
//@Controller
//@RequestMapping("/user")
//public class UserController {
//    @RequestMapping("/queryUsers")
//    public String queryUsers(Model model){
//        List<User> userList = new ArrayList<>();
//        User userA = new User();
//        userA.setUserName("dengyj");
//        userA.setAge("20");
//        User userB = new User();
//        userB.setUserName("zhaodf");
//        userB.setAge("20");
//        userList.add(userA);
//        userList.add(userB);
//        model.addAttribute("userList",userList);
//        return "userList";
//    }
//}

//方法一：继承AbstractController，返回ModelAndView，访问地址是：applicationContext中配置<prop key="/userList">部分，直接访问/userList
//这种方式是需要在applicationContext.xml中配置访问请求与控制器的对应关系（key-value）
public class UserController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<User> userList = new ArrayList<>();
        User userA = new User();
        userA.setUserName("dengyj");
        userA.setAge("20");
        User userB = new User();
        userB.setUserName("zhaodf");
        userB.setAge("20");
        userList.add(userA);
        userList.add(userB);
        return new ModelAndView("userList","userList",userList);
    }
}
