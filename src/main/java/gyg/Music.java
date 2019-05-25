package gyg;

import java.util.List;
import java.util.Map;

public class Music {
    private String musicer, song;
    private List<String> list;
    private Map<String,String> map;

    public Music( Map<String, String> map) {
        this.map = map;
    }

    public Music(String musicer, String song, List list) {
        this.musicer = musicer;
        this.song = song;
        this.list = list;
    }

    public Music(List<String> list) {
        this.list = list;
    }

    public Music() {
        super();
    }

    public Music(String musicer, String song) {
        this.musicer = musicer;
        this.song = song;
    }

    //单曲
    public void song() {
        System.out.println("单曲：" + musicer + "  " + "作家：" + song);
    }

    //list类型
    public void cd() {
        System.out.println("单曲：" + musicer + "  " + "作家：" + song);
        for (String temp : this.list) {
            System.out.println("单曲：" + temp);
        }
    }
    //map类型
    public void song_cd() {
        for (String s : this.map.keySet()) {
            System.out.println("作者："+s+"    "+"单曲："+map.get(s));
        }
    }


}
