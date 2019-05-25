package gyg;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//如果不想使用Primary关键字修饰，可以用限定符，使用的时候就可以配对使用
//注意：可以不加Qualifier如不加的话默认是以类名首字母小写
//@Qualifier("add")
public class UserServiceAdd implements UserService {
    public void add() {
        System.out.println("加载方法......");
    }
}
