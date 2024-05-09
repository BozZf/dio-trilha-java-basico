package models;

import models.interfaces.InternetBrowser;
import models.interfaces.MusicPlayer;
import models.interfaces.Telephone;

public class Iphone implements MusicPlayer, Telephone, InternetBrowser {

    public void turnOn() {
        System.out.println("TURNING ON");
    }
    public void turnOff() {
        System.out.println("TURNING OFF");
    }
    
    // Music Player
    @Override
    public void play() {
        System.out.println("PLAYING MUSIC");
    }
    @Override
    public void pause() {
        System.out.println("PAUSING MUSIC"); 
    }
    @Override
    public void selectMusic() {
        System.out.println("SELECTING MUSIC");  
    }

    // Telephone
    @Override
    public void call() {
        System.out.println("CALLING");
    }
    @Override
    public void answer() {
        System.out.println("ANSWERED CALL");
    }
    @Override
    public void startVoiceMail() {
        System.out.println("VOICE MAIL STARTED");
    }

    // Internet Browser
    @Override
    public void showPage() {
        System.out.println("PAGE LOADED");
    }
    @Override
    public void addNewTab() {
        System.out.println("ADDED NEW TAP");
    }
    @Override
    public void updatePage() {
        System.out.println("PAGE UPDATED");
    }
}
