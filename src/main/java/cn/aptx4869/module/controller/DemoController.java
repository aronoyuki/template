package cn.aptx4869.module.controller;

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
    @RequestMapping("/demo")
    public String demo(Model model){
        model.addAttribute("result", "success");
        return "template";
    }
}
