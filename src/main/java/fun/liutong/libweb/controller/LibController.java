package fun.liutong.libweb.controller;

import fun.liutong.libweb.libReserve.LibTool;
import fun.liutong.libweb.pojo.LibUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LibController {
    @Autowired
    LibTool libTool;

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    @ResponseBody
    public String book(LibUser libUser) {
        try {
            if(libUser.getName()==null||libUser.getName().trim().equals("")){
                return "用户名不正确";
            }
            libTool.setLibUser(libUser);
            libTool.start();
        }catch (Exception e){
            return "设置错误";
        }
        return "设置成功";
    }
}
