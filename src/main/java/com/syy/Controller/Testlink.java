package com.syy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author siyongye
 * @create 2020-05-18
 */
@RequestMapping("/test")
@Controller
public class Testlink {
    @RequestMapping("/demo")
    @ResponseBody
    public String dd(){
        return "你好啊";
    }
    @RequestMapping("/indeed")
    public String index(){
        return "index";
    }
}
