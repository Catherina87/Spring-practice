package ru.kate.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Now Spring has read the config file applicationContext.xml
        // and now we can get the bean
        // getBean takes 2 params: bean Id and class name from which we take the bean

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();


        // we should close the context in the end
        context.close();
    }
}
