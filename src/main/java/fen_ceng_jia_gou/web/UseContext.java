package fen_ceng_jia_gou.web;

import fen_ceng_jia_gou.servlet.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UseContext {
    @Resource(name = "one")
    private UserService userService;

    public void add(){
        userService.add();
    }
}
