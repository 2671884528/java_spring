package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CD_play {
    @Autowired(required = false)//默认是true

    private CD cd;

    public CD_play() {
        super();
        System.out.println("CD_play空调用函数");
    }

    public void getCd(CD cd){
        this.cd = cd;
    }

    public void play(){
        if (cd != null)
        cd.play();
    }
}
