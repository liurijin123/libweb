package fun.liutong.libweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "Hello World";
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String test(){
        return "test";
    }
}
