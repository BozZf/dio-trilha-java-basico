package application;

import models.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();

        iphone.turnOn();

        System.out.println("Music Player:");
        iphone.selectMusic();
        iphone.play();
        iphone.pause();

        System.out.println();
        System.out.println("Telephone:");
        iphone.call();
        iphone.answer();
        iphone.startVoiceMail();

        System.out.println();
        System.out.println("Internet Browser:");
        iphone.showPage();
        iphone.updatePage();
        iphone.addNewTab();
        
        iphone.turnOff();
    }
}
