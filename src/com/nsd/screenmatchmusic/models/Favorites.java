package com.nsd.screenmatchmusic.models;

public class Favorites {
    public void additions(Audio audio){
        if(audio.getClassification()>=8){
            System.out.println(audio.getTitle()+" these are the best moments");
        }else {
            System.out.println(audio.getTitle()+" these are fine");
        }
    }
}
