package gyg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-contractor.xml")
public class MusicName {

    @Autowired
    private Music music;

//    @Autowired
//    @Qualifier("music2")
//    private Music music_xue;
//
//
//    @Name1
//    public void print(){
////        music.song();
//        music_xue.cd();
//    }

    @Test
    public void print(){
        music.song_cd();
    }

}
