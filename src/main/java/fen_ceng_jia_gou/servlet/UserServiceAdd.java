package fen_ceng_jia_gou.servlet;

import fen_ceng_jia_gou.dao.UseDao;
import gyg.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//@Primary
//如果不想使用Primary关键字修饰，可以用限定符，使用的时候就可以配对使用
//注意：可以不加Qualifier如不加的话默认是以类名首字母小写
//@Qualifier("add")
@Component("one")
public class UserServiceAdd implements fen_ceng_jia_gou.servlet.UserService {
    @Autowired
    private UseDao useDao;

    @Autowired
    private UseDao useDao1;

    public void add() {
        System.out.println("UseServiceAdd已装配"+this);
        useDao.my_print();
        useDao1.my_print();
    }
}
