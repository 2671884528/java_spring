package hello;

import org.springframework.stereotype.Component;

//@Component, 当注释掉的时候就无法自动形成装配，编译器对CD_play类的autowired不通过，
//但是可以通过设置autowired（false）设置跳过检查，慎用
@Component
public class CD {
    public CD() {
        super();
        System.out.println("CD空调用函数");
    }
    public void play(){
        System.out.println("播放音乐");
    }
}
