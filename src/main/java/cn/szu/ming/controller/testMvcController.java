package cn.szu.ming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/testMvc")
public class testMvcController {
    @RequestMapping(method = RequestMethod.GET)
    public String returnTest(){
        return "test";
    }

}
