package cn.wjc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wangjianchao1
 * @create 2016 09 28 14:02
 */
@Controller
@RequestMapping("auth")
public class AuthController {

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {

        return "login";
    }
}
