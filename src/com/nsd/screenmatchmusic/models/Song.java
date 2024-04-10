package com.nsd.screenmatchmusic.models;

public class Song extends Audio{
    private String artist;
    private String album;
    private String genre;
    // getters and setters


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    //

    @Override
    public int getClassification() {
        if(getTotalLikes()>5000){
            return 8;
        }else {
            return 4;
        }
    }
}
