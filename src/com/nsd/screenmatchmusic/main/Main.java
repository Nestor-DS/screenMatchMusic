package com.nsd.screenmatchmusic.main;

import com.nsd.screenmatchmusic.models.Podcast;
import com.nsd.screenmatchmusic.models.Song;

public class Main {
    public static void main(String[] args) {
        Song mySong = new Song();
        mySong.setTitle("Mr Loverman");
        mySong.setAlbum("Mr Loverman-123");
        mySong.setArtist("Ricky Montgomery");

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Monkeys");
        myPodcast.setAuthor("Suguru");
        myPodcast.setDescription("This is a podcast about monkeys");

        for(int i = 0; i < 100; i++){
            mySong.likes();
        }
        for(int i = 0; i < 500; i++){
            mySong.plays();
        }

        System.out.println("""
                The song %s from the album %s with a total of %d plays and %d likes
                """.formatted(mySong.getTitle(),mySong.getAlbum(),mySong.getTotalPlays(),mySong.getTotalLikes()));
    }
}
