package com.example.bookverse;

public class RecyclerViewListActivity {
    private Integer image;
    private String text;
    private String synopsis;

    public RecyclerViewListActivity(Integer image, String text, String synopsis){
        this.image = image;
        this.text = text;
        this.synopsis = synopsis;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}