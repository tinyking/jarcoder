package cn.wjc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static javafx.scene.input.KeyCode.R;

/**
 * @author wangjianchao1
 * @create 2016 09 26 14:16
 */

@Controller
public class IndexController {

    @RequestMapping(value = {"", "/index"})
    public String index() {
        return "index";
    }
}
