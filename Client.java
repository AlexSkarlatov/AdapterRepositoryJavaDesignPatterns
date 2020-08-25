package com.company.adapter_solution;

public class Client {
    public static void main(String... args){
        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play();
    }

}
