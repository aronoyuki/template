package cn.aptx4869.module.controller;

import cn.aptx4869.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huy
 * @date 2018/9/29 20:06
 * @description
 */
@Controller
@RequestMapping
public class DemoController {
    @Autowired
    private UserService userService;
    @RequestMapping("/demo")
    public String demoJsp(Model model){
        userService.insertUsers();
        model.addAttribute("result", "success.jsp");
        return "template";
    }


    @RequestMapping("/test")
    public String testContentNegotiatingViewResolver(Model model){
        model.addAttribute("users", userService.getUserList());
        return "template";
    }
}
