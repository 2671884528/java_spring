package gyg;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = gyg.AppConfig.class)
public class UserServiceName {
//    @Autowired
    //@Qualifier("add_festival")//这里可以改变自己已经设置的限定符的名字来达到指向的是不同的类
//    @Qualifier("userServiceAdd_festival")
    //由于有两个类实现了接口，会导歧义，编译器识别不了，会报错,可以加primary
    //但是只能有一个primary，有两个会报错
    @Resource(name = "userServiceAdd_festival")
    //Amplifier()和Autowired是spring的标准，我们也可以采用javax里面的Resource()
    private UserService service;

    @Test
    public void add(){
        service.add();
    }
}
