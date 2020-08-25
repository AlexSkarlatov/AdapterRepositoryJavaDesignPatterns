package com.company.adapter_solution;

public interface MediaPlayerInterface {
    public void play(String audioType, String fileName);
}


 class AudioPlayer implements  MediaPlayerInterface{

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. name " + fileName);
        }
        else {
            System.out.println("invalid media. " + audioType + " format not supported");
        }
    }
}