package gyg;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//不加参数默认是以类名首字母小写
@Component("userServiceAdd_festival")
//@Primary
//可以不加Qualifier如不加的话默认是以类名首字母小写
//@Qualifier("add_festival")
public class UserServiceAdd_festival implements UserService {
    public UserServiceAdd_festival() {
        System.out.println("自动加载类"+this);
    }

    public void add() {
        System.out.println("节日快乐，欢迎注册"+this.hashCode());
    }
}
