package ru.kate.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;


    // we need this constructor when we do DI with setter
    public MusicPlayer() {}


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusicList() {
        System.out.println("These songs are playing: ");
        for(Music m: musicList) {
            System.out.println(m.getSong());
        }
    }
}
